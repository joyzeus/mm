package com.jay.mm.module.dao;

import com.jay.mm.module.entity.doo.UserPermission;

/**
 * @author zhouxu
 * @date 2019/12/12
 */
public interface UserPermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserPermission record);

    int insertSelective(UserPermission record);

    UserPermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserPermission record);

    int updateByPrimaryKey(UserPermission record);
}