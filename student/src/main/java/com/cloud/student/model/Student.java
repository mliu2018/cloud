package com.cloud.student.model;import lombok.Data;import java.math.BigInteger;/** * 学生实体类 * */@Datapublic class Student {    //主键id    private int id;    //姓名    private String name;    //学号    private String studentNo;    //性别(0、男1、女)    private String sex;    //年级    private int grade;    //班级    private int classes;    //住址    private String address;    //年纪    private int age;    //爱好    private String hobby;}