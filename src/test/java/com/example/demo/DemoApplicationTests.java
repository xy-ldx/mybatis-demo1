package com.example.demo;

import com.example.entity.Result;
import com.example.entity.Select;
import com.example.entity.Student;
import com.example.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    void selelctTest() {
        Select selectInfo = new Select();
        int nowPageIndex = 1;
        int pageSize = 5;
        selectInfo.setPageNumber((nowPageIndex - 1) * pageSize);
        selectInfo.setPageSize(pageSize);
        selectInfo.setOrderBy("stuAge");
        selectInfo.setHighToLow(true);
        selectInfo.setIsGraduate(true);
        selectInfo.setMinAge(17);
        selectInfo.setMaxAge(26);
        List<List<?>> findtest = studentMapper.findResultByInfo(selectInfo);
        List<Result> orderinfos = (List<Result>) findtest.get(0);
        int totalCount = (Integer) findtest.get(1).get(0);
        System.out.println("当前页面记录数：" + orderinfos.size());
        System.out.println("符合条件记录数：" + totalCount);
        System.out.println("当前页数：" +nowPageIndex);
        System.out.println("总页数：" + ((totalCount + pageSize - 1) / pageSize));
        orderinfos.forEach(System.out::println);
    }


    @Test
    public void testInsertBatch() {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.setStuName("ldx");
        student1.setStuAge(23);
        student1.setGraduateDate(new Date());
        student1.setFacultyId(1L);
        student2.setStuName("wf");
        student2.setStuAge(22);
        student2.setGraduateDate(new Date());
        student2.setFacultyId(2L);
        ArrayList<Student> objects = new ArrayList<>();
        objects.add(student1);
        objects.add(student2);
        studentMapper.insertBatch(objects);

    }

    @Test
    public  void protest1() {
        List<Student> students = studentMapper.protest1();
        System.out.println(students);
    }


    @Test
    public void protest2() {
        List<List<?>> lists = studentMapper.protest2();
        System.out.println(lists);
    }

}
