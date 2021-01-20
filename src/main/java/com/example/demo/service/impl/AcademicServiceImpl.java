package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.Academic;
import com.example.demo.mapper.AcademicMapper;
import com.example.demo.service.AcademicService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.vo.acacdemicvo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
public class AcademicServiceImpl extends ServiceImpl<AcademicMapper, Academic> implements AcademicService {
    @Autowired
    private AcademicMapper academicMapper;
    @Override
    public List<Academic> getAllAcademic() {
        List<Academic> academics = academicMapper.selectList(null);

        return academics;
    }

    @Override
    public List<Academic> getWhoAcademic(String nameinput) {

        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("name",nameinput);
        queryWrapper.orderByAsc("arname");
        List<Academic> academics = academicMapper.selectList(queryWrapper);
        return academics;
    }

    @Override
    public void Insert(String name, String artical, String authorlevel, String arname) {
        Academic academic = new Academic();
        academic.setName(name);
        academic.setArtical(artical);
        academic.setArname(arname);
        academic.setAuthorlevel(authorlevel);
        academicMapper.insert(academic);

    }


    //按作者的名称进行查询
    @Override
    public List<Academic> Select(String name) {
        List<Academic> academics = new ArrayList<>();
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("name",name);
        academics = academicMapper.selectList(queryWrapper);
        return academics;
    }
//    @Override
//    public List<Academic> groupbyname(){
//        List<Academic> academics = academicMapper.SelectGroup();
//        return academics;
//    }
}
