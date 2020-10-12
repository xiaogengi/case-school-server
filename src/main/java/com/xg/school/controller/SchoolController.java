package com.xg.school.controller;

import com.xg.school.base.Response;
import com.xg.school.service.ISchoolService;
import com.xg.school.vo.SchoolDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: case-school-server
 * @description:
 * @author: gengzhaokai
 * @create: 2020-09-09 16:04
 **/
@CrossOrigin
@RestController
@RequestMapping("/school")
public class SchoolController {

    @Autowired
    private ISchoolService schoolService;

    @RequestMapping("add")
    public Response add(SchoolDTO schoolDTO){
        return schoolService.add(schoolDTO);
    }

    @RequestMapping("query")
    public Response query(SchoolDTO schoolDTO){
        return schoolService.query(schoolDTO);
    }

    @RequestMapping("delete")
    public Response delete(SchoolDTO schoolDTO){
        return schoolService.delete(schoolDTO);
    }

    @RequestMapping("update")
    public Response update(SchoolDTO schoolDTO){
        return schoolService.update(schoolDTO);
    }

    @RequestMapping("queryById")
    public Response queryById(SchoolDTO schoolDTO){
        return schoolService.queryById(schoolDTO);
    }

}
