package com.example.wht.calculate;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2019/6/5-14:55
 * @description 房贷计算器参数
 */
public class CalculatorParams {

    private double basicRate; // 商贷基准利率

    private double providentRate; // 公积金基准利率

    private int upRate; // 商贷上浮比例

    private int years; // 贷款年限

    private double area; // 面积

    private double price; // 价格

    private double totalPrice; // 总价

    private double firstPayPercent; // 首付比例

    private double providentFundCount; // 公积金可贷金额

    private double providentFundSupply; // 公积金月供

    private double commercialLoanSupply; // 商贷月供

    private double totalSupply; // 总月供

    public double getBasicRate() {
        return basicRate;
    }

    public void setBasicRate(double basicRate) {
        this.basicRate = basicRate;
    }

    public double getProvidentRate() {
        return providentRate;
    }

    public void setProvidentRate(double providentRate) {
        this.providentRate = providentRate;
    }

    public int getUpRate() {
        return upRate;
    }

    public void setUpRate(int upRate) {
        this.upRate = upRate;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getFirstPayPercent() {
        return firstPayPercent;
    }

    public void setFirstPayPercent(double firstPayPercent) {
        this.firstPayPercent = firstPayPercent;
    }

    public double getProvidentFundCount() {
        return providentFundCount;
    }

    public void setProvidentFundCount(double providentFundCount) {
        this.providentFundCount = providentFundCount;
    }

    public double getProvidentFundSupply() {
        return providentFundSupply;
    }

    public void setProvidentFundSupply(double providentFundSupply) {
        this.providentFundSupply = providentFundSupply;
    }

    public double getCommercialLoanSupply() {
        return commercialLoanSupply;
    }

    public void setCommercialLoanSupply(double commercialLoanSupply) {
        this.commercialLoanSupply = commercialLoanSupply;
    }

    public double getTotalSupply() {
        return totalSupply;
    }

    public void setTotalSupply(double totalSupply) {
        this.totalSupply = totalSupply;
    }
}
