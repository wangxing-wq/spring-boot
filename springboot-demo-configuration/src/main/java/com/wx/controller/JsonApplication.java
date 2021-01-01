package com.wx.controller;

import com.wx.config.ConfigComputer;
import com.wx.config.ConfigFoot;
import com.wx.config.ConfigVegetables;
import com.wx.domain.Computer;
import com.wx.domain.Foot;
import com.wx.domain.Vegetables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wang xing
 * @RestController声明这个类下的映射返回的都是JSON类型
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
        return new Foot(configFoot.getMeat(),configFoot.getRice(),configFoot.getSauce());
    }

    @Autowired
    ConfigVegetables configVegetables;

    @RequestMapping("/vegetables")
    public Vegetables vegetables(){
        return new Vegetables(configVegetables.getGreenPepper(),configVegetables.getEggplant(),configVegetables.getPotato());
    }


    @Autowired
    ConfigComputer configComputer;

    @RequestMapping("/computer")
    public Computer computer(){
        Computer computer = new Computer();
        computer.setCpu(configComputer.getCpu());
        computer.setMouse(configComputer.getMouse());
        computer.setKeyboard(configComputer.getKeyboard());
        computer.setViewing(configComputer.getViewing());
        return computer;
    }

}
