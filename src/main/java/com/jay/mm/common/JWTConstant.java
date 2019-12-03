package com.jay.mm.common;

/**
 * @author zhouxu
 * @version v1.0
 * @email 1419982188@qq.com
 * @date 2019/12/3 10:37
 */
public interface JWTConstant {

    /**
     * jwt登录唯一验证码
     */
    String JWT_LOGIN = "jwt_login";

    /**
     * jwt登录的有效期
     */
    long LOGIN_EXPIRED_TIME = 1000 * 60 * 60 * 24 * 30L;

}
