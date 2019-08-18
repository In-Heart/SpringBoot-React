package com.example.wht.common.utils;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2019/6/5-15:16
 * @description 房贷计算器工具类
 */
public class CalculatorUtils {

    /**
     * 静态内部类的单例模式，只有在getInstance时才实例化对象
     */
    private CalculatorUtils(){}

    private static class CalculatorUtilsInstance{
        private static final CalculatorUtils INSTANCE = new CalculatorUtils();
    }

    public static CalculatorUtils getInstance(){
        return CalculatorUtilsInstance.INSTANCE;
    }


    /**
     * 月供，商贷或者公积金
     * @param countSum 贷款总金额
     * @param basicRate 基准利率
     * @param upRate 上浮比例
     * @param years 贷款年限
     * @return 月供金额
     */
    public double calculateMonthlySupply(double countSum, double basicRate, int upRate, int years){
        return countSum * calculatePercent(calculateMonthRate(calculateTrueRate(basicRate, upRate))
                ,calculateRates(calculateMonthRate(calculateTrueRate(basicRate, upRate)), years));
    }

    /**
     * 计算真实利率
     * @param basicRate 基准利率
     * @param upRate 上浮比例
     * @return
     */
    private double calculateTrueRate(double basicRate, int upRate){
        return basicRate * (1 + upRate * 0.01);
    }

    /**
     * 计算月利率
     * @param rate 年利率
     * @return
     */
    private double calculateMonthRate(double rate){
        return rate * 0.01 / 12;
    }

    /**
     * 计算复合利率系数
     * @param monthRate 月利率
     * @param years 贷款年限
     * @return
     */
    private double calculateRates(double monthRate, int years){
        return Math.pow(1+monthRate, years*12);
    }

    /**
     * 计算贷款系数
     * @param monthRate 月利率
     * @param calculatedRate 复合利率，贷款期数复合
     * @return
     */
    private double calculatePercent(double monthRate, double calculatedRate){
        return monthRate * calculatedRate / (calculatedRate -1);
    }
}
