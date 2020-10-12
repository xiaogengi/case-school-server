package com.xg.school.controller;

import com.xg.school.base.Response;
import com.xg.school.service.IFileService;
import com.xg.school.vo.FileDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: case-school-server
 * @description:
 * @author: gengzhaokai
 * @create: 2020-10-10 10:45
 **/
@CrossOrigin
@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    private IFileService fileService;

    @RequestMapping("/query")
    public Response query(FileDTO fileDTO){
        return fileService.query(fileDTO);
    }



}
