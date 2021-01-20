package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.Teacher;
import com.example.demo.mapper.TeacherMapper;
import com.example.demo.service.TeacherService;
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
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public void Insert(String tno, String tname, String tssex, String tlevel, String tintroduce) {
        Teacher teacher = new Teacher();
        teacher.setTno(tno);
        teacher.setTname(tname);
        teacher.setTsex(tssex);
        teacher.setTlevel(tlevel);
        teacher.setTintroduce(tintroduce);
        teacherMapper.insert(teacher);
        System.out.println(teacher.toString());
        System.out.println("教师信息插入成功");

    }

    @Override
    public void update(String tno, String tname, String tssex, String tlevel, String tintroduce) {
        Teacher teacher = new Teacher();
        teacher.setTno(tno);
        teacher.setTname(tname);
        teacher.setTsex(tssex);
        teacher.setTlevel(tlevel);
        teacher.setTintroduce(tintroduce);
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("tno",tno);
        teacherMapper.update(teacher,queryWrapper);
    }

    @Override
    public List<Teacher> getAllTeacher() {
        List<Teacher> teacherList = teacherMapper.selectList(null);
        return teacherList;
    }


    @Override
    public Teacher getOneTeachet(String nameinput) {
        Teacher teacher = new Teacher();
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("tname",nameinput);
        teacher = teacherMapper.selectOne(queryWrapper);
        return teacher;
    }
}
