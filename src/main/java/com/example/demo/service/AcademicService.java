package com.example.demo.service;

import com.example.demo.entity.Academic;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.vo.acacdemicvo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author long
 * @since 2021-01-03
 */
public interface AcademicService extends IService<Academic> {
    public List<Academic> getAllAcademic();
    public List<Academic> getWhoAcademic(String nameinput);
    public void Insert(String name,String artical,String authorlevel,String arname);
    public List<Academic> Select(String name);


}
