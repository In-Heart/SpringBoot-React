package com.example.wht.common.response;

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
    private Object data;

    public Result(Object data) {
        this.code = Constants.successCode;
        this.msg = Constants.successMsg;
        this.data = data;
    }

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static Result SUCCESS(Object data){
        return new Result(data);
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
