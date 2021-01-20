package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class denglu {
    @RequestMapping("denglu")
    public String main(){
        return "denglu.html";
    }

}
