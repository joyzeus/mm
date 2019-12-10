package com.jay.mm.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhouxu
 * @version v1.0
 * @email 1419982188@qq.com
 * @date 2019/12/10 13:50
 */
@Configuration
@MapperScan("com.jay.mm.module.dao")
public class MyBatisConfig {
}
