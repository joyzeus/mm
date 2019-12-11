package com.jay.mm.module.entity.doo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhouxu
 * @date 2019/12/12
 */
@Data
public class Role implements Serializable {
    private Integer id;

    private String name;

    private Integer type;

    private Date createTime;

    private Integer createId;
}