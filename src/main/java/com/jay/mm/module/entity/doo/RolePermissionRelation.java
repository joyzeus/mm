package com.jay.mm.module.entity.doo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhouxu
 * @date 2019/12/12
 */
@Data
public class RolePermissionRelation implements Serializable {
    private Integer id;

    private Integer roleId;

    private Integer permissionId;
}