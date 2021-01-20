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
@RequestMapping("/teacher")
public class TeacherController {
    @Resource
    private voMapper vomapper;
    @Autowired
    private StudentService studentService;
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private AcademicService academicService;
/*
下面两个页面跳转的方法为主跳转登录函数
 */
    @RequestMapping("/list")
    public  String test(){
        return "teacher_page/teacher_homepage";
    }
//    @PostMapping("gettea")
//    public String Gettea(String submit, HttpSession session){
//        return null;
//    }



    //modelandview方法可以实现页面的跳转和参数的数值的传递。
//    @GetMapping("/slist")
//    public ModelAndView list(){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("/student_page/main");
//        modelAndView.addObject("list",studentService.getAllStudent());
//        return modelAndView;
//    }


    @PostMapping("/gettea")
    public ModelAndView getstu(String submit, HttpServletRequest request, HttpServletResponse response, HttpSession session){
        if (submit.equals("学生信息查看")){
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("student_page/studentmessage");
            modelAndView.addObject("list",studentService.getAllStudent());

            return modelAndView;



        }if(submit.equals("学生信息添加")){
            ModelAndView modelAndView1 = new ModelAndView();
            modelAndView1.setViewName("student_page/student_update");

            //modelAndView1.addObject("list",teacherService.getAllTeacher());
            return modelAndView1;
        }if(submit.equals("教师信息查看")){
            ModelAndView modelAndView1 = new ModelAndView();
            modelAndView1.setViewName("teacher_page/teachermessage");
            modelAndView1.addObject("list",teacherService.getAllTeacher());
            return modelAndView1;

        }
        if(submit.equals("教师信息添加")){
            ModelAndView modelAndView1 = new ModelAndView();
            modelAndView1.setViewName("teacher_page/inserttea");
           // modelAndView1.addObject("list",teacherService.Insert(););
            return modelAndView1;

        }if(submit.equals("论文查看")){
            ModelAndView modelAndView2 = new ModelAndView();
            modelAndView2.setViewName("artical_page/tarticalmessage");
            modelAndView2.addObject("listartical",academicService.getAllAcademic());
            modelAndView2.addObject("listorderbyname",vomapper.selectByName());
            return modelAndView2;


        }if(submit.equals("论文录入")){
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("artical_page/tea_redoartical");
            //modelAndView.addObject("listartical",academicService.getWhoAcademic());
            return modelAndView;
        }else{
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("teacher_page/t_home");
            modelAndView.addObject("teacher",teacherService.getOneTeachet(submit));

            return modelAndView;
        }


    }
    @PostMapping("/redostumess")
    public ModelAndView TeacherAcation(String sno,String sname,String ssex,String sclass,String shometown,
                                       Integer sscore,Integer ssort,String sintroduce,String scollege){

        ModelAndView modelAndView = new ModelAndView();
        studentService.insert(sno,sname,ssex,sclass,shometown,
                sscore, ssort, sintroduce,scollege);


        modelAndView.setViewName("teacher_page/teacher_homepage");



        //在此进行学生成员的信息修改


        return modelAndView;
    }
    @PostMapping("/insertteacher")
    public ModelAndView TeacherAcationInsert(String tno,String tname,String tsex,String tlevel,String tintroduce) {

        ModelAndView modelAndView = new ModelAndView();
        teacherService.Insert(tno, tname, tsex, tlevel, tintroduce);


        modelAndView.setViewName("teacher_page/teacher_homepage");


        //在此进行学生成员的信息修改


        return modelAndView;
    }
    @PostMapping("updateteacher")
    public ModelAndView TeacehrUpdate(String tno,String tname,String tsex,String tlevel,String tintroduce){
        ModelAndView modelAndView = new ModelAndView();
        teacherService.update(tno,tname,tsex,tlevel,tintroduce);
        modelAndView.setViewName("teacher_page/teacher_homepage");
        return modelAndView;
    }


}

