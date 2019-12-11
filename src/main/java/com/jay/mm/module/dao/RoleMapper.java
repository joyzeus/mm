package com.jay.mm.module.dao;

import com.jay.mm.module.entity.doo.Role;

/**
 * @author zhouxu
 * @date 2019/12/12
 */
public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}