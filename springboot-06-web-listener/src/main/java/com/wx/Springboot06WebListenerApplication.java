package com.wx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.wx.filter")
public class Springboot06WebListenerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot06WebListenerApplication.class, args);
    }

}
