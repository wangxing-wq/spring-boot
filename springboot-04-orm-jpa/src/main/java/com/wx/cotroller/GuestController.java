package com.wx.cotroller;

import com.wx.entity.Guest;
import com.wx.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author wang xing
 */
@Controller
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    GuestService guestService;

    @GetMapping
    public String guestList(Model model){
        model.addAttribute("list",guestService.list());
        return "list";
    }


}
