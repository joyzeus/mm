package com.jay.mm.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhouxu
 * @version v1.0
 * @email 1419982188@qq.com
 * @date 2019/11/24 14:54
 */
@Configuration
public class JWTConfig {

    @Value("${jay.mm.jwt}")
    public String jwtSecret;
}
