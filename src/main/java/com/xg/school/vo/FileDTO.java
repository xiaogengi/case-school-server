package com.xg.school.vo;

import lombok.*;

import java.util.List;

/**
 * @program: case-school-server
 * @description:
 * @author: gengzhaokai
 * @create: 2020-10-10 10:51
 **/
@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FileDTO {

    private String path;
    private String name;
    private List<FileDTO> fileList;

    // 对应 FileTypeEnum
    private FileType fileType;


}
