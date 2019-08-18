package com.example.wht.common.response;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2018/11/14-14:49
 * @description
 */
public class Constants {
    public static final int successCode = 1;
    public static final int errorCode = -1;
    public static final int exceptionCode = 0;
    public static final String successMsg = "请求成功";
    public static final String errorMsg = "请求失败";
    public static final String exceptionMsg = "请求异常";
    public static final int userStatus = 1; // 用户状态，默认1，已经注销或者异常为0
    public static final int roleId = 0; // 角色ID，0-为系统管理员，拥有所有权限；1-为普通用户；2-客户（仅能观看所售商品种类和售价，可下单）


    public static final double basicLoanRate = 4.9; // 贷款基准利率
    public static final double providentLoanRate = 3.25; // 公积金贷款基准利率
}
