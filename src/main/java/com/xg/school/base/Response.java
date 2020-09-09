package com.xg.school.base;

import com.xg.school.enums.CodeEnum;

/**
 * @program: case-school-server
 * @description:
 * @author: gengzhaokai
 * @create: 2020-09-09 16:16
 **/
public class Response<T> {

    private Integer code;
    private String msg;
    private T data;

    public static<R> Response<R> build(R data){
        return new Response<R>(data);
    }

    public static<R> Response<R> build(boolean status){
        if(status){
            return new Response<R>(CodeEnum.SUCCESS);
        }else{
            return new Response<R>(CodeEnum.FAILED);
        }
    }

    public static<R> Response<R> build(Integer code, String msg, R data){
        return new Response<R>(code, msg, data);
    }

    public static<R> Response<R> build(CodeEnum codeEnum, R data){
        return new Response<R>(codeEnum.getCode(), codeEnum.getMsg(), data);
    }


    public static<R> Response<R> build(CodeEnum codeEnum){
        return new Response<R>(codeEnum.getCode(), codeEnum.getMsg());
    }



    public Response(T data) {
        this.code = CodeEnum.SUCCESS.getCode();
        this.msg = CodeEnum.SUCCESS.getMsg();
        this.data = data;
    }

    public Response(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Response(CodeEnum codeEnum) {
        this.code = codeEnum.getCode();
        this.msg = codeEnum.getMsg();
    }

    public Response(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
