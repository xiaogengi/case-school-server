package com.xg.school.service;

import com.xg.school.base.Response;
import com.xg.school.vo.FileDTO;

public interface IFileService {

    Response query(FileDTO fileDTO);

}
