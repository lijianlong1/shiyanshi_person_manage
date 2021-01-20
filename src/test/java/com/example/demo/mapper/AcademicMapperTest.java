package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.Academic;
import com.example.demo.vo.acacdemicvo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AcademicMapperTest {
    @Resource
    private AcademicMapper academicMapper;
    @Resource
    private voMapper vomapper;
    @Test
    void Test(){



        QueryWrapper<Academic> wrapper=new QueryWrapper<>();
        academicMapper.selectList(wrapper).forEach(System.out::println);;
//        System.out.println(academics);
//        System.out.println(academics.get(0).toString());

    }

    @Test
    void Test1(){
        List<acacdemicvo> acacdemicvos = vomapper.selectByName();
       //acacdemicvos.forEach(System.out::println);
        System.out.println(acacdemicvos.get(0).getScount());


    }




}