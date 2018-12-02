package com.example.wht.common.response;

import java.awt.*;
import java.util.ArrayList;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2018/11/14-14:41
 * @description
 */
public class Result {
    /**
     * 响应码
     */
    private int code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 数据
     */
    public Object data;

    public Result (){}

    public Result(Object data) {
        this.code = Constants.successCode;
        this.msg = Constants.successMsg;
        this.data = data;
    }

    public Result(Object data, String msg) {
        this.code = Constants.successCode;
        this.msg = msg;
        this.data = data;
    }

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data = new ArrayList<>();
    }

    public Result(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 请求成功仅带数据
     * 适用于查找
     * @param data 返回数据
     * @return
     */
    public static Result SUCCESS(Object data){
        return new Result(data);
    }

    /**
     * 请求成功，包括数据和附带信息
     * 适用于查找
     * @param data
     * @param msg
     * @return
     */
    public static Result SUCCESS(Object data, String msg){
        return new Result(data, msg);
    }

    /**
     * 请求成功，没有返回数据，适用于新增和删除
     * @param msg
     * @return
     */
    public static Result SUCCESS(String msg){
        return new Result(Constants.successCode, msg);
    }

    /**
     * 请求失败
     * @param errMsg
     * @return
     */
    public static Result ERROR(String errMsg){
        return new Result(Constants.errorCode, errMsg);
    }

    public static Result ERROR(String ... params){
        return new Result(Constants.errorCode, "接口参数错误" + params);
    }

    public static Result EXCEPTION(String msg){
        msg = msg == null ? "服务器异常" : msg;
        return new Result(Constants.errorCode, msg);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
