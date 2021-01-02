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

    @PostMapping
    public String addGuest(Guest guest){
        guestService.add(guest);
        return "redirect:/guest";
    }

    @GetMapping("/toAdd")
    public String toAdd(){
        return "add";
    }

    @DeleteMapping("/{name}")
    public String deleteGuest(@PathVariable("name") String name){
        System.out.println("删除");
        guestService.delete(name);
        return "redirect:/guest";
    }

    @GetMapping("/toUpdate/{name}")
    public String toUpdate(@PathVariable("name") String name,Model model){
        model.addAttribute("guest",guestService.getGuest(name));
        return "update";
    }

    @PutMapping
    public String updateGuess(Guest guest){
        System.out.println(guest);
        guestService.update(guest);
        return "redirect:/guest";
    }

}
