package com.example.demo.service;

import com.example.demo.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author long
 * @since 2021-01-03
 */
public interface StudentService extends IService<Student> {
    public List<Student> getAllStudent();
    public Student getOneStudent(String nameinput);
    public void update(String sno,String sname,String ssex,String sclass,String shometown,
                       Integer sscore,Integer ssort,String sintroduce,String scollege);
    public void insert(String sno,String sname,String ssex,String sclass,String shometown,
                       Integer sscore,Integer ssort,String sintroduce,String scollege);


}
