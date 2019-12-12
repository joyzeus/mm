package com.jay.mm.module.dao;

import com.jay.mm.module.entity.doo.Permission;

import java.util.List;

public interface PermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Permission record);

    List<Permission> getList(Permission permission);
}