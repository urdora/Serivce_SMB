package com.smb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
@MapperScan({"com.smb.mapper"})
public class SmartBalanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartBalanceApplication.class, args);
    }
}

