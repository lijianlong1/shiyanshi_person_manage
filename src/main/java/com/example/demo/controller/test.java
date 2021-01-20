package com.example.demo.controller;

import com.example.demo.entity.User_all;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class test {
    @RequestMapping("log321")
    public String Session(HttpSession session){
        session.getAttribute("user_one");
        User_all u = new User_all();

        return session.getAttribute("user_one").toString();

    }
}
