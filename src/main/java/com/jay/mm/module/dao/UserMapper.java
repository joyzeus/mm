package com.jay.mm.module.dao;

import com.jay.mm.module.entity.doo.User;

/**
 * @author zhouxu
 * @date 2019/12/10
 */
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    User selectByMobile(String mobile);
}