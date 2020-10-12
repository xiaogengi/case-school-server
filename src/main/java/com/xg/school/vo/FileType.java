package com.xg.school.vo;

import lombok.*;

/**
 * @program: case-school-server
 * @description:
 * @author: gengzhaokai
 * @create: 2020-10-10 11:18
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FileType {

    private Integer code;
    private String desc;
    private String imgPath;


}
