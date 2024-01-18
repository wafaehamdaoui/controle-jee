package com.eidia.newtp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class homeController {
    @GetMapping({"/acceuill","home1"})
    public String home(@RequestParam(value="name", defaultValue="MED", required= true) String name, Model model) {
        model.addAttribute("name",name);
        return "home";
    }

}