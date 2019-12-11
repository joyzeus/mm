package com.jay.mm.module.dao;

import com.jay.mm.module.entity.doo.Permission;

/**
 * @author zhouxu
 * @date 2019/12/12
 */
public interface PermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
}