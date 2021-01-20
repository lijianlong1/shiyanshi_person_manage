package com.example.demo.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.User_all;
import com.example.demo.service.StudentService;
import com.example.demo.service.User_allService;
import com.example.demo.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author long
 * @since 2021-01-03
 */
@Controller
@RequestMapping("/user_all")
public class User_allController {

//    @RequestMapping("/login1")
//    public String tset(){
//
//        return "denglu.html";
//    }


    @Autowired
    private User_allService user_allService;
    @RequestMapping("/denglu")
    public String text(){
        return "denglu";
    }


    @PostMapping("/login")
    public String login(String nameinput, String password, HttpSession session) {
        //z在此进行查询操作，在service中进行查询操作的注入
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("uno", nameinput);
        wrapper.eq("password", password);

        User_all user_one = user_allService.getOne(wrapper);



        /*
        在此进行逻辑判断，判断登录用户是老师还是学生，
        并且检查用户登录密码的正确性。
        如果登陆的账户为“教师”，则进入教师端的控制页面
        如果登陆的用户为“学生”，则进入学生端的控制页面
        否则，账号密码输入错误，重新输入
        使用redirect：/student/list
        *使用redirect实现登陆页面的失败重新返回操作
         */
        if (user_one == null) {
            return "failure";
        } else {
            if (user_one.getStyle().contains("学生")) {
                session.setAttribute("user_one", user_one.getName());
                return "redirect:/student/list/";
            }else{
                session.setAttribute("user_one", user_one.getName());
                return "redirect:/teacher/list";

            }
        }

//        if (user_one.getStyle().equals(" 教师  ")) {
//            return "redirect:/teacher/";
//        }else if (user_one.getStyle().equals(" 学生  ")) {
//            return "redirect:/student/list/";
//        } else(user_one==null){
//            return "failure.html";
//        }
    }




    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "denglu";
    }



}

