package com.jay.mm.module.dao;

import com.jay.mm.module.entity.doo.UserRole;

/**
 * @author zhouxu
 * @date 2019/12/12
 */
public interface UserRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}