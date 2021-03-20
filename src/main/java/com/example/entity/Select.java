package com.example.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lidexin
 * @create 2021-03-14 13:38
 */
@Data
public class Select  implements Serializable {
    private  String stuName;//模糊搜索学生名
    private Integer minAge;//最小年龄 用Integer不用int是因为用户可以不选择此条件（null）即没有最小年龄限制 用int默认值是0
    private Integer maxAge;//最大年龄
    private Boolean isGraduate;//是否毕业 为null就是不管毕业还是没毕业都要
    private Integer pageNumber;//第几页 从1开始
    private Integer pageSize;//每页几个数据
    private String orderBy;//排序字段
    private Boolean highToLow;//是否降序 为false和null就是升序 为true就是降序
}
