package com.example.controller;

import com.example.entity.Result;
import com.example.entity.Select;
import com.example.entity.Student;
import com.example.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lidexin
 * @create 2021-03-14 14:00
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentMapper studentMapper;

   @GetMapping("query")
    public  List<Result>  queryPagedOrderBy(@RequestBody Select select)  {
       List<List<?>> findtest = studentMapper.findResultByInfo(select);
       List<Result> orderinfos = (List<Result>) findtest.get(0);
       int totalCount = (Integer) findtest.get(1).get(0);
       System.out.println("当前页面记录数：" + orderinfos.size());
       System.out.println("符合条件记录数：" + totalCount);
       orderinfos.forEach(System.out::println);
       return orderinfos;
    }

    @PostMapping("InsertBatch")
    public Integer InsertBatch(@RequestBody List<Student> list) {
        int i = studentMapper.insertBatch(list);
        return i;
    }



}
