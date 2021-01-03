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
        System.out.println(guestService.list());
        model.addAttribute("list",guestService.list());
        return "list";
    }

    @PostMapping
    public String addGuest(Guest guest){
        guestService.save(guest);
        return "redirect:/guest";
    }

    @GetMapping("/toAdd")
    public String toAdd(){
        return "add";
    }

    @DeleteMapping("/{id}")
    public String deleteGuest(@PathVariable("id") Integer id){
        guestService.removeById(id);
        return "redirect:/guest";
    }

    @GetMapping("/toUpdate/{id}")
    public String toUpdate(@PathVariable("id") Integer id,Model model){
        System.out.println(guestService.getById(id));
        model.addAttribute("guest",guestService.getById(id));
        return "update";
    }

    @PutMapping
    public String updateGuess(Guest guest){
        System.out.println(guest);
        guestService.updateById(guest);
        return "redirect:/guest";
    }

}
