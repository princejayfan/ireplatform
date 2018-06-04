package com.jay.ireplatform.Common;

/**
 * Created by Jay
 * date : 2018/6/4
 * des :
 */
public enum ResultCode {
    SUCCESS("200"),                   //成功
    FAIL("400"),                      //失败
    UNAUTHORIZED("401"),              //未认证（签名错误）
    NOT_FOUND("404"),                 //接口不存在
    INTERNAL_SERVER_ERROR("500");     //服务器内部错误

    public String code;

    ResultCode(String code) {
        this.code = code;
    }
}
