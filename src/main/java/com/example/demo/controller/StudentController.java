package com.example.demo.controller;


import com.example.demo.mapper.voMapper;
import com.example.demo.service.AcademicService;
import com.example.demo.service.StudentService;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
@RequestMapping("/student")
public class StudentController {
    @Resource
    private voMapper vomapper;
    @Autowired
    private StudentService studentService;
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private AcademicService academicService;


    //modelandview方法可以实现页面的跳转和参数的数值的传递。
//    @GetMapping("/slist")
//    public ModelAndView list(){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("/student_page/main");
//        modelAndView.addObject("list",studentService.getAllStudent());
//        return modelAndView;
//    }



    @RequestMapping("/list")
    public String Tset(){
        return "/student_page/student_homepage";
    }



    @RequestMapping("/list/main")
    public String Main(){
        return "/student_page/main";
    }



    @PostMapping("/getstu")
    public ModelAndView getstu(String submit, HttpServletRequest request, HttpServletResponse response,HttpSession session){
        if (submit.equals("学生信息查看")){
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("student_page/studentmessage");
            modelAndView.addObject("list",studentService.getAllStudent());

            return modelAndView;



        }if(submit.equals("教师信息查看")){
            ModelAndView modelAndView1 = new ModelAndView();
            modelAndView1.setViewName("teacher_page/teachermessage");
            modelAndView1.addObject("list",teacherService.getAllTeacher());
            return modelAndView1;
        }if(submit.equals("论文查看")){
            ModelAndView modelAndView2 = new ModelAndView();
            modelAndView2.setViewName("artical_page/sarticalmessage");
            modelAndView2.addObject("listartical",academicService.getAllAcademic());
            //在此函数中应该加上，论文排序的相应情况。
            modelAndView2.addObject("listorderbyname",vomapper.selectByName());
            return modelAndView2;


        }if(submit.equals("论文录入")){
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("/artical_page/stu_redoartical");
            //modelAndView.addObject("listartical",academicService.getWhoAcademic());
            return modelAndView;




        }else{
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("student_page/s_home");
            modelAndView.addObject("student",studentService.getOneStudent(submit));

            return modelAndView;
        }


    }
    @PostMapping("/redostumess")
    public ModelAndView StudentAcation(String sno,String sname,String ssex,String sclass,String shometown,
                                       Integer sscore,Integer ssort,String sintroduce,String scollege){

        ModelAndView modelAndView = new ModelAndView();
        studentService.update(sno,sname,ssex,sclass,shometown,
                sscore, ssort, sintroduce,scollege);


        modelAndView.setViewName("student_page/student_homepage");



        //在此进行学生成员的信息修改


        return modelAndView;
    }
//    @PostMapping("/other")
//    public String StudentAcation(String submit){
//        return null;
//
//    }
}

