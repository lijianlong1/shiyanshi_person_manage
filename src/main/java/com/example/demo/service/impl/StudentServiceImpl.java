package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.Student;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author long
 * @since 2021-01-03
 */
//service层里面写数据的封装
    //先把实体类拿出来
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> getAllStudent(){
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.select().orderByAsc("ssort");

        List<Student> studentalllist = studentMapper.selectList(queryWrapper);
        //视情况将上面的集合转化成vo类型的集合
        return studentalllist;
    }
    @Override
    public Student getOneStudent(String nameinput) {
        Student student = new Student();
        Student student1;
        student.setSname(nameinput);
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("sname", student.getSname());
        student1 = studentMapper.selectOne(queryWrapper);
        return student1;
    }
//至此我们已经将相关的数据取出来了

    @Override
    public void insert(String sno, String sname, String ssex, String sclass, String shometown, Integer sscore, Integer ssort, String sintroduce, String scollege) {
        Student student = new Student();
        student.setSno(sno);
        student.setSname(sname);
        student.setSsex(ssex);
        student.setSclass(sclass);
        student.setShometown(shometown);
        student.setSscore(sscore);
        student.setSsort(ssort);
        student.setSintroduce(sintroduce);
        student.setScollege(scollege);
        System.out.println(student);
        studentMapper.insert(student);
        System.out.println(student.toString());
        System.out.println("成功添加");
    }

    @Override
    public void update(String sno, String sname, String ssex, String sclass, String shometown, Integer sscore, Integer ssort, String sintroduce, String scollege) {
        Student student = new Student();
        student.setSno(sno);
        student.setSname(sname);
        student.setSsex(ssex);
        student.setSclass(sclass);
        student.setShometown(shometown);
        student.setSscore(sscore);
        student.setSsort(ssort);
        student.setSintroduce(sintroduce);
        student.setScollege(scollege);
        System.out.println(student);

        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("sno",sno);
        studentMapper.update(student,queryWrapper);
        System.out.println(student.toString());
        System.out.println("成功修改");
    }
}
