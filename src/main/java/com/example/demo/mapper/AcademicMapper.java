package com.example.demo.mapper;

import com.example.demo.entity.Academic;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.vo.acacdemicvo;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.sql.Wrapper;
import java.util.Collection;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author long
 * @since 2021-01-03
 * 在此可以自己写一个Dao进行数据库的查询和添加高操作性的需求！
 */

public interface AcademicMapper extends BaseMapper<Academic> {


}
