package com.li.baby.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @GetMapping("welcome.html")
    public String welcomePage(){
        return "welcome";
    }
}
