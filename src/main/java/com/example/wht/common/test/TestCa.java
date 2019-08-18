package com.example.wht.common.test;

import java.util.Scanner;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2019/6/4-15:59
 * @description 贷款计算器
 */
public class TestCa {
    public static void main(String[] args){
        double basicRate = 4.9;
        double basicRateGjj = 3.25;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商贷利率上浮比例：");
        int rate = sc.nextInt();
        System.out.println("请输入商贷年限：");
        int years = sc.nextInt();
        System.out.println("请输入贷款总额(元)：");
        double countSum = sc.nextDouble();
        System.out.println("请输入公积金可贷额度(元)：");
        double countGjj = sc.nextDouble();

        double monthRateSd = calculateMonthRate(calculateTrueRate(basicRate, rate));
        double businessCount = (countSum - countGjj) * calculatePercent(monthRateSd, calculateRates(monthRateSd, years));


        if(countGjj > 0) {
            double monthRateGjj = calculateMonthRate(basicRateGjj);
            double gjjCount = countGjj * calculatePercent(monthRateGjj, calculateRates(monthRateGjj, years));
            System.out.println("月供为："+ (gjjCount+businessCount) + "元，其中：商贷—"+businessCount+"元；公积金—"+ gjjCount + "元");
        } else {
            System.out.println("月供为："+ (businessCount) + "元（纯商贷）");
        }

//        5.88÷100÷12×[(1+5.88÷100÷12)^360]÷[(1+5.88÷100÷12)^360-1]
    }

    /**
     * 计算真实利率
     * @param basicRate 基准利率
     * @param upRate 上浮比例
     * @return
     */
    private static double calculateTrueRate(double basicRate, int upRate){
        return basicRate * (1 + upRate * 0.01);
    }

    /**
     * 计算月利率
     * @param rate 年利率
     * @return
     */
    private static double calculateMonthRate(double rate){
        return rate * 0.01 / 12;
    }

    /**
     * 计算复合利率系数
     * @param monthRate 月利率
     * @param years 贷款年限
     * @return
     */
    private static double calculateRates(double monthRate, int years){
        return Math.pow(1+monthRate, years*12);
    }

    /**
     * 计算贷款系数
     * @param monthRate 月利率
     * @param calculatedRate 复合利率，贷款期数复合
     * @return
     */
    private static double calculatePercent(double monthRate, double calculatedRate){
        return monthRate * calculatedRate / (calculatedRate -1);
    }
}
