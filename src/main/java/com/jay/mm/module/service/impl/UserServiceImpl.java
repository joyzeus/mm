package com.jay.mm.module.service.impl;

import com.jay.mm.module.dao.RoleMapper;
import com.jay.mm.module.dao.UserMapper;
import com.jay.mm.module.entity.doo.User;
import com.jay.mm.module.service.base.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhouxu
 * @version v1.0
 * @email 1419982188@qq.com
 * @date 2019/11/22 14:55
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    private final RoleMapper roleMapper;

    @Autowired(required = false)
    public UserServiceImpl(UserMapper userMapper, RoleMapper roleMapper) {
        this.userMapper = userMapper;
        this.roleMapper = roleMapper;
    }

    @Override
    public User selectByMobile(String mobile) {
        return userMapper.selectByMobile(mobile);
    }
}
