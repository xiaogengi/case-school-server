package com.xg.school.enums;

/**
 * @program: case-school-server
 * @description:
 * @author: gengzhaokai
 * @create: 2020-09-09 16:16
 **/
public enum  CodeEnum {
    SUCCESS(10000, "success"),
    FAILED(20000, "failed"),
    SERVER_ERROR(50000, "系统繁忙!")
    ;


    CodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
