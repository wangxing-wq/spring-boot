package com.wx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.wx.dao")
public class Springboot04OrmMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot04OrmMybatisApplication.class, args);
    }

}
