package com.xg.school.mapper;

import com.xg.school.vo.SchoolDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SchoolMapper {


    @Insert("insert into ca_school (school_name, school_desc, school_logo_path) " +
            "VALUES" +
            " (#{param.schoolName}, #{param.schoolDesc}, #{param.schoolLogoPath})")
    int add(@Param("param") SchoolDTO schoolDTO);


    @Select("select * from ca_school")
    List<SchoolDTO> query(@Param("param") SchoolDTO schoolDTO);
}
