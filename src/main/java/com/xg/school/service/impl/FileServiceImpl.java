package com.xg.school.service.impl;

import com.xg.school.base.Response;
import com.xg.school.enums.CodeEnum;
import com.xg.school.enums.FileTypeEnum;
import com.xg.school.service.IFileService;
import com.xg.school.vo.FileDTO;
import com.xg.school.vo.FileType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: case-school-server
 * @description:
 * @author: gengzhaokai
 * @create: 2020-10-10 10:46
 **/
@Service
@Slf4j
public class FileServiceImpl implements IFileService {


    @Override
    public Response query(FileDTO fileDTO) {
        try {
            // 第一次进来展示根目录
            if(fileDTO == null || fileDTO.getPath() == null || "".equals(fileDTO.getPath())){
                log.info("FileServiceImpl -->> query file info...");
                File[] files = File.listRoots();
                FileDTO response = null;
                for (File file : files) {

                    response = FileDTO.builder()
                            .name("".equals(file.getName())? "根目录" : file.getName())
                            .path(file.getPath())
                            .fileList(getFileList(file.listFiles()))
                            .fileType(getFileType(file))
                            .build();

                }
                return Response.build(response);
            }
            log.info("this a path : [{}]", fileDTO.getPath());
            File file = new File(fileDTO.getPath());
            if(!file.isDirectory()){
                return Response.build(CodeEnum.FILE_TYPE_FAILED);
            }
            File[] files = file.listFiles();
            if(files == null || files.length == 0){
                return Response.build(CodeEnum.DIR_NULL_FAILED);
            }
            return Response.build(
                    FileDTO
                        .builder()
                        .name(file.getName())
                        .path(file.getPath())
                        .fileList(getFileList(files))
                        .fileType(getFileType(file))
                        .build()
            );
        } catch (Exception e){
            log.error("FileServiceImpl -->> query error[{}]", e);
            return Response.build(CodeEnum.SERVER_ERROR);
        }
    }

    private List<FileDTO> getFileList(File[] files) {
        List<FileDTO> fileList = new ArrayList<>();
        for (File file1 : files) {
            fileList.add(
                    FileDTO.builder()
                    .name("".equals(file1.getName())? "根目录" : file1.getName())
                    .path(file1.getPath())
                    .fileType(getFileType(file1))
                    .build()
            );
        }
        return fileList;
    }

    private FileType getFileType(File file) {
        FileTypeEnum fileTypeEnum =  file.isDirectory() ? FileTypeEnum.FOLDER_FILE : FileTypeEnum.TXT_FILE;
        return FileType
                .builder()
                .code(fileTypeEnum.getCode())
                .desc(fileTypeEnum.getDesc())
                .imgPath(fileTypeEnum.getImgPath())
                .build();
    }
}
