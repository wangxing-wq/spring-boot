package com.wx.controller;

import com.wx.entity.Foot;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wang xing
 */


@Controller
public class ThymeleafController {

    @RequestMapping("/thyme")
    public String thymeleaf(Model model){
        model.addAttribute("foot",new Foot("大米","烤肉"));
        return "/thymeleaf/index.html";
    }
}
