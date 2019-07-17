package com.hui.zhang.core.result;

import java.io.Serializable;

/**
 * Created by zhanghui on 2017/12/26.
 */
public class RpcResult<T> implements Serializable {

    public boolean success;
    public String msg;
    public long code;
    public  T result;

    public RpcResult(){}

    public RpcResult(boolean success,long code,String msg,T result){
        this.success=success;
        this.code=code;
        this.msg=msg;
        this.result=result;
    }
    public RpcResult(long code,String msg){
        this.success=false;
        this.code=code;
        this.msg=msg;
        this.result=null;
    }

    public RpcResult(T result){
        this.success=true;
        this.code=0L;
        this.msg="成功！";
        this.result=result;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
