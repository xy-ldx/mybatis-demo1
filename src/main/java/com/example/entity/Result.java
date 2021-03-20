package com.example.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author lidexin
 * @create 2021-03-14 13:39
 */
@Data
public class Result implements Serializable {
    private Long id;
    private String stuName;
    private Integer stuAge;//为什么要用Integer而不是int 因为int会有默认值0，而Integer默认是null，如果查到年龄为null就会显示为0岁了，这样输出到前端就是0岁，而我们不期望前端展示为null的数据
    private Date graduateDate;
    private String facultyName;
}
