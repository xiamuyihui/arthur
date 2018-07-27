package com.tough.pojo;

import java.io.Serializable;

public class Result implements Serializable {

    private static final long serialVersionUID = -6557898536448299915L;

    public static final int SUCCESS_CODE = 0;

    public static final int ERROR_CODE = 1;

    private int success;

    private Object data;

    private Object obj;

    private int msgCode;

    private String msg;

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public int getMsgCode() {
        return msgCode;
    }

    public void setMsgCode(int msgCode) {
        this.msgCode = msgCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
