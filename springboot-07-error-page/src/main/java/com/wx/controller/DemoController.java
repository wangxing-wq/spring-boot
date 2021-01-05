package com.wx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wang xing
 */
@Controller
public class DemoController {


    @RequestMapping("/demo")
    public void demo(){
        System.out.println(1/0);
    }
}
