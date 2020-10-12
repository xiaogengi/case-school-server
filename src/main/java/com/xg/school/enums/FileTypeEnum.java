package com.xg.school.enums;

/**
 * @program: case-school-server
 * @description:
 * @author: gengzhaokai
 * @create: 2020-10-10 11:13
 **/
public enum  FileTypeEnum {

    TXT_FILE(1,"文本文件", "https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1093418767,206348562&fm=26&gp=0.jpg"),
    FOLDER_FILE(2,"文件夹", "https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3843214554,2514928761&fm=26&gp=0.jpg")
    ;


    private Integer code;
    private String desc;
    private String imgPath;

    FileTypeEnum(Integer code, String desc, String imgPath) {
        this.code = code;
        this.desc = desc;
        this.imgPath = imgPath;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public String getImgPath() {
        return imgPath;
    }
}
