package com.example.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author lidexin
 * @create 2021-03-14 13:36
 */
@Data
public class Student  implements Serializable {
    private Long id;
    private String stuName;
    private Integer stuAge;
    private Date graduateDate;
    private Long facultyId;
}
