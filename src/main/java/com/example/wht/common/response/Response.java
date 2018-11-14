package com.example.wht.common.response;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2018/11/14-14:44
 * @description
 */
public interface Response {

    /**
     * 请求成功
     * 有数据
     * @param object
     * @return
     */
    Result success(Object object);

    /**
     * 请求成功，不包含成功数据
     * @return
     */
    Result success();

    /**
     * 请求失败
     * @param code 错误码
     * @param msg 错误信息
     * @return
     */
    Result error(Integer code, String msg);
}
