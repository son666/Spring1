package com.geekbrains.geekmarket.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Controller
public class MainController {
    @RequestMapping("/")
    public String showHomePage() {
        return "index";
    }

    @RequestMapping("favicon.ico")
    String favicon() {
        return "forward:/resources/favicon.ico";
    }
}
