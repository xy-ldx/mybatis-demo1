package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.Select;
import com.example.entity.Student;

import java.util.List;
import java.util.Map;

/**
 * @author lidexin
 * @create 2021-03-14 13:43
 */
public interface StudentMapper extends BaseMapper<Student> {
    List<List<?>> findResultByInfo(Select select);

    int insertBatch(List<Student> list);


    List<Student> protest1();

    List<List<?>> protest2();
}
