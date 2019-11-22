package com.jay.mm.module.dao;

import com.jay.mm.module.entity.doo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    User selectByMobile(String mobile);
}