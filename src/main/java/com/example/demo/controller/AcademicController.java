package com.example.demo.controller;


import com.example.demo.mapper.voMapper;
import com.example.demo.service.AcademicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author long
 * @since 2021-01-03
 */
@Controller
@RequestMapping("/academic")
public class AcademicController {
    @Resource
    private voMapper vomapper;
    @Autowired
    private AcademicService academicService;
    @PostMapping("/insertstu")
    public ModelAndView test(String name,String artical,String authorlevel,String arname){
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("student_page/student_homepage");
        academicService.Insert(name,artical,authorlevel,arname);

        return modelAndView;
    }
    @PostMapping("/inserttea")
    public ModelAndView tea(String name,String artical,String authorlevel,String arname){
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("teacher_page/teacher_homepage");
        academicService.Insert(name,artical,authorlevel,arname);

        return modelAndView;

    }
    @PostMapping("/tgetonestu")
    public ModelAndView tsee(String namestu){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("artical_page/tarticalmessage");
        modelAndView.addObject("listartical",academicService.getWhoAcademic(namestu));
        modelAndView.addObject("listorderbyname",vomapper.selectByName());


        return modelAndView;
    }
    @PostMapping("/sgetonestu")
    public ModelAndView ssee(String namestu){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("artical_page/sarticalmessage");
        modelAndView.addObject("listartical",academicService.getWhoAcademic(namestu));
        modelAndView.addObject("listorderbyname",vomapper.selectByName());


        return modelAndView;
    }
    @PostMapping("/tgroupsee")
    public ModelAndView tgsee(){
        return null;
    }
    @PostMapping("/sgsee")
    public ModelAndView sgsee(){
        return null;
    }


}

