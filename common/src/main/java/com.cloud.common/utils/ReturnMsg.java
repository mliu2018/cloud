package com.cloud.common.utils;public class ReturnMsg {    private String code;    private String msg;    private Object entity = null;    private  static final String SUCCESS_CODE = "000000";    private static final String FAIL_CODE = "999999";    //private static final String OTHER_CODE = "111111";    private static final String SUCCESS_MSG = "请求成功";    private static final String FAIL_MSG = "请求失败";    //private static final String OTHER_MSG = "未知请求";    public ReturnMsg(String code,String msg){        this.code = code;        this.msg = msg;    }    public static ReturnMsg isSuccess(Object object){        ReturnMsg returnMsg = new ReturnMsg(ReturnMsg.SUCCESS_CODE,ReturnMsg.SUCCESS_MSG);        returnMsg.entity = object;        return returnMsg;    }    public static ReturnMsg isFail(){        return new ReturnMsg(ReturnMsg.FAIL_CODE,ReturnMsg.FAIL_MSG);    }}