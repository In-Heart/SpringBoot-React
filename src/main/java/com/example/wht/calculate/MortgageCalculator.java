package com.example.wht.calculate;

import com.example.wht.common.response.Constants;
import com.example.wht.common.response.Result;
import com.example.wht.common.utils.CalculatorUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2019/6/5-14:30
 * @description 房贷计算器，接口
 */
@RestController
@RequestMapping(value = {"/calculator"})
public class MortgageCalculator {

    @RequestMapping(value = "/mortgageCalculator", produces = {"application/json;charset=UTF-8"},
            method = RequestMethod.GET)
    public Result MortgageCalculator(CalculatorParams calculatorParams){
        if(calculatorParams.getTotalPrice() == 0){
            calculatorParams.setTotalPrice(calculatorParams.getPrice() * calculatorParams.getArea());
        }
        if(calculatorParams.getProvidentFundCount() > 0){
            calculatorParams.setProvidentFundSupply(
                    CalculatorUtils.getInstance().calculateMonthlySupply(calculatorParams.getProvidentFundCount()
                    ,calculatorParams.getProvidentRate() >=0 ? calculatorParams.getProvidentRate() : Constants.providentLoanRate, 0, calculatorParams.getYears())
            );
        } else{
            calculatorParams.setProvidentFundSupply(0.00);
        }
        calculatorParams.setCommercialLoanSupply(
                CalculatorUtils.getInstance().calculateMonthlySupply(calculatorParams.getTotalPrice() - calculatorParams.getProvidentFundCount()
                        , calculatorParams.getBasicRate() >=0 ? calculatorParams.getBasicRate() : Constants.basicLoanRate, calculatorParams.getUpRate(), calculatorParams.getYears())
        );
        calculatorParams.setTotalSupply(calculatorParams.getCommercialLoanSupply()+calculatorParams.getProvidentFundSupply());
        return new Result(calculatorParams);
    }

    @RequestMapping(value = "/decorationCalculator", produces = {"application/json;charset=UTF-8"},
            method = RequestMethod.GET)
    public Result decorationCalculator(DecorationParams decorationParams){
        double totalCount = decorationParams.getTotalPrice();
        if(decorationParams.getTotalPrice() <= 0){
            if(decorationParams.getFirstPayPercent() > 0) {
                totalCount = (int) (decorationParams.getArea() * decorationParams.getPrice() * (1 - decorationParams.getFirstPayPercent()) / 10000) * 10000;
            } else {
                totalCount = (int) (decorationParams.getArea() * decorationParams.getPrice()  / 10000) * 10000;
            }
        }
        decorationParams.setMonthlySupply(
                CalculatorUtils.getInstance().calculateMonthlySupply(totalCount
                        , decorationParams.getBasicRate() >=0 ? decorationParams.getBasicRate() : Constants.basicLoanRate, decorationParams.getUpRate(), decorationParams.getYears())
        );
        return new Result(decorationParams);
    }
}
