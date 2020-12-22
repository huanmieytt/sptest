package com.laoyu.sptest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.laoyu.sptest.mapper")
public class SptestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SptestApplication.class, args);
    }

}
