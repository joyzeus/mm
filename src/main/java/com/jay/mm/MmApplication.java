package com.jay.mm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhouxu
 * @version 1.0
 * @date 2019/11/22
 */
@SpringBootApplication
@MapperScan("com.jay.mm.module.dao")
public class MmApplication {

    public static void main(String[] args) {
        SpringApplication.run(MmApplication.class, args);
    }
}
