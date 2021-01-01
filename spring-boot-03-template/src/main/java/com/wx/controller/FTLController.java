package com.wx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wang xing
 */
@Controller
@RequestMapping("/ftl")
public class FTLController {

    @RequestMapping("/demo")
    public String demo(Model model){
        model.addAttribute("text","测试");
        return "index";
    }

}
