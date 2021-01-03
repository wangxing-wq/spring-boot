package com.wx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wx.dao")
public class Springboot04OrmMybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot04OrmMybatisPlusApplication.class, args);
    }

}
