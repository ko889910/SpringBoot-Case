package com.hufei.mybatis.mybatisdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.hufei.mybatis.mybatisdemo.mapper")
public class MybatisdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisdemoApplication.class, args);
    }

}
