package com.xg.school.service.impl;

import com.xg.school.base.Response;
import com.xg.school.enums.CodeEnum;
import com.xg.school.mapper.SchoolMapper;
import com.xg.school.service.ISchoolService;
import com.xg.school.vo.SchoolDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: case-school-server
 * @description:
 * @author: gengzhaokai
 * @create: 2020-09-09 17:10
 **/
@Service
@Slf4j
public class SchoolServiceImpl implements ISchoolService {

    @Autowired
    private SchoolMapper schoolMapper;


    @Override
    public Response add(SchoolDTO schoolDTO) {
        try {
            int result = schoolMapper.add(schoolDTO);
            return Response.build(result > 0);
        } catch (Exception e){
            log.error("SchoolServiceImpl -->> add error[{}]", e);
            return Response.build(CodeEnum.SERVER_ERROR);
        }
    }

    @Override
    public Response query(SchoolDTO schoolDTO) {
        try {
            List<SchoolDTO> result = schoolMapper.query(schoolDTO);
            return Response.build(result);
        } catch (Exception e){
            log.error("SchoolServiceImpl -->> query error[{}]", e);
            return Response.build(CodeEnum.SERVER_ERROR);
        }
    }

    @Override
    public Response delete(SchoolDTO schoolDTO) {
        return null;
    }

    @Override
    public Response queryById(SchoolDTO schoolDTO) {
        return null;
    }

    @Override
    public Response update(SchoolDTO schoolDTO) {
        return null;
    }
}
