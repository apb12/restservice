package com.accenture.restservice.controller;

import com.accenture.restservice.service.RestServiceUsr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    RestServiceUsr restServiceUsr;
    @GetMapping("/greeting")
    public String greeting(Model model){

        model.addAttribute("message",restServiceUsr.findAllUsers());
        return "greeting";
    }
}
