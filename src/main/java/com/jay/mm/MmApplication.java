package com.jay.mm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author zhouxu
 * @version 1.0
 * @date 2019/11/22
 */
@SpringBootApplication
@EnableTransactionManagement(proxyTargetClass = true)
@EnableScheduling
public class MmApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MmApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(MmApplication.class, args);
    }
}
