package com.example.wht.calculate;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2019/6/11-14:45
 * @description 精装修贷款计算
 */
public class DecorationParams {
    private double basicRate; // 商贷基准利率

    private int upRate; // 商贷上浮比例

    private int years; // 贷款年限

    private double area; // 面积

    private double price; // 价格

    private double totalPrice; // 总价

    private double firstPayPercent; // 首付比例

    private double monthlySupply; // 总月供

    public double getBasicRate() {
        return basicRate;
    }

    public void setBasicRate(double basicRate) {
        this.basicRate = basicRate;
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

    public double getMonthlySupply() {
        return monthlySupply;
    }

    public void setMonthlySupply(double monthlySupply) {
        this.monthlySupply = monthlySupply;
    }
}
