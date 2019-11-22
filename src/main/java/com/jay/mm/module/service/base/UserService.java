package com.jay.mm.module.service.base;

import com.jay.mm.module.entity.doo.User;

/**
 * @author zhouxu
 * @version v1.0
 * @email 1419982188@qq.com
 * @date 2019/11/22 14:55
 */
public interface UserService {

    /**
     * 根据手机号查询用户信息
     *
     * @param mobile
     * @return com.jay.mm.module.entity.doo.User
     */
    User selectByMobile(String mobile);
}
