package com.example.demo.service.impl;

import com.example.demo.mapper.TeacherMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TeacherServiceImplTest {
    @Autowired
    private TeacherMapper teacherMapper;
    @Test
    void tset(){
        System.out.println(teacherMapper.selectList(null).toString());

    }


}