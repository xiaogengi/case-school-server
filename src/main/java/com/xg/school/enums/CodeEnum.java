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
    SERVER_ERROR(50000, "系统繁忙!"),


    FILE_TYPE_FAILED(70001, "该文件不是文件夹，请选择其他操作！"),
    DIR_NULL_FAILED(70002, "文件夹下暂无文件")
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
