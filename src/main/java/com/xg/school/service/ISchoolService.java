package com.xg.school.service;

import com.xg.school.base.Response;
import com.xg.school.vo.SchoolDTO;

public interface ISchoolService {

    Response add(SchoolDTO schoolDTO);

    Response query(SchoolDTO schoolDTO);

    Response delete(SchoolDTO schoolDTO);

    Response queryById(SchoolDTO schoolDTO);

    Response update(SchoolDTO schoolDTO);

}
