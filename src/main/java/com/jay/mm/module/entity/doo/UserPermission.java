package com.jay.mm.module.entity.doo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhouxu
 * @date 2019/12/12
 */
@Data
public class UserPermission implements Serializable {
    private Integer id;

    private Integer userId;

    private Integer permissionId;

    private Date expiredTime;
}