package com.jay.mm.module.entity.doo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhouxu
 * @date 2019/12/12
 */
@Data
public class Permission implements Serializable {
    private Integer id;

    private String name;

    private Integer parentId;

    private String path;
}