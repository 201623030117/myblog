package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TrivialController {
    @RequestMapping("/index")
    public String gotoIndex(){
        return "index";
    }
}
