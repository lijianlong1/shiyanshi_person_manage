package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.example.demo.vo.acacdemicvo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public  interface voMapper extends BaseMapper<acacdemicvo> {
    /**
     *
     * 如果自定义的方法还希望能够使用MP提供的Wrapper条件构造器，则需要如下写法
     *
     * @param userWrapper
     * @return
     */
//    @Select("SELECT * FROM user ${ew.customSqlSegment}")
//    List<User> selectByMyWrapper(@Param(Constants.WRAPPER) Wrapper<User> userWrapper);

    /**
     * 和Mybatis使用方法一致
     * @param
     * @return
     */

    //@Select("SELECT * FROM user where name = #{name}")
    @Select("select name as sname,count(name) as scount from academic group by name order by scount desc")
    List<acacdemicvo> selectByName();

}
