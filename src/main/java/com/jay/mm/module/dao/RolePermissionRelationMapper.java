package com.jay.mm.module.dao;

import com.jay.mm.module.entity.doo.RolePermissionRelation;

/**
 * @author zhouxu
 * @date 2019/12/12
 */
public interface RolePermissionRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RolePermissionRelation record);

    int insertSelective(RolePermissionRelation record);

    RolePermissionRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RolePermissionRelation record);

    int updateByPrimaryKey(RolePermissionRelation record);
}