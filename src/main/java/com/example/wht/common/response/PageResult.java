package com.example.wht.common.response;

import java.util.List;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2018/11/14-16:20
 * @description 分页查询返回对象
 */
public class PageResult<T> {
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
    private List<T> data;

    /**
     * 总数量
     */
    private long count;

    public PageResult(){

    }

    public PageResult(List<T> data, long count) {
        this.data = data;
        this.count = count;
        this.code = Constants.successCode;
        this.msg = Constants.successMsg;
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

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
