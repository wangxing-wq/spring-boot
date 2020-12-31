package com.wx.controller;

import com.wx.config.ConfigFoot;
import com.wx.domain.Foot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wang xing
 */
@RestController
public class JsonApplication {

//    @Value("${foot.rice}")
//    String rice;
//
//    @Value("${foot.meat}")
//    String meat;

    @Autowired
    ConfigFoot configFoot;

    @RequestMapping("/json")
    public Foot json(){
        System.out.println(configFoot.getMeat() + "===" +configFoot.getRice());
        return new Foot(configFoot.getMeat(),configFoot.getRice());
    }

}
