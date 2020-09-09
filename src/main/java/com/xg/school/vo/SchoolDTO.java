package com.xg.school.vo;

/**
 * @program: case-school-server
 * @description:
 * @author: gengzhaokai
 * @create: 2020-09-09 16:15
 **/
public class SchoolDTO {

    private Integer id;
    private String schoolName;
    private String schoolDesc;
    private String schoolLogoPath = "https://img.yzcdn.cn/vant/cat.jpeg";

    @Override
    public String toString() {
        return "SchoolDTO{" +
                "id=" + id +
                ", schoolName='" + schoolName + '\'' +
                ", schoolDesc='" + schoolDesc + '\'' +
                ", schoolLogoPath='" + schoolLogoPath + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolDesc() {
        return schoolDesc;
    }

    public void setSchoolDesc(String schoolDesc) {
        this.schoolDesc = schoolDesc;
    }

    public String getSchoolLogoPath() {
        return schoolLogoPath;
    }

    public void setSchoolLogoPath(String schoolLogoPath) {
        this.schoolLogoPath = schoolLogoPath;
    }

    public SchoolDTO(Integer id, String schoolName, String schoolDesc, String schoolLogoPath) {
        this.id = id;
        this.schoolName = schoolName;
        this.schoolDesc = schoolDesc;
        this.schoolLogoPath = schoolLogoPath;
    }

    public SchoolDTO() {
    }
}
