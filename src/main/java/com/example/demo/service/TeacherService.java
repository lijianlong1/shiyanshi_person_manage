package com.example.demo.service;

import com.example.demo.entity.Teacher;
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
public interface TeacherService extends IService<Teacher> {
    public List<Teacher> getAllTeacher();
    public Teacher getOneTeachet(String nameinput);
    public void Insert(String tno,String tname,String tssex,String tlevel,String tintroduce);
    public void update(String tno,String tname,String tssex,String tlevel,String tintroduce);

}
