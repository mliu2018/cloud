package com.cloud.student.service.impl;import com.cloud.student.mapper.StudentMapper;import com.cloud.student.model.Student;import com.cloud.student.service.StudentService;import org.springframework.stereotype.Service;import javax.annotation.Resource;/** * 学生操作处理类 * */@Servicepublic class StudentServiceImpl implements StudentService {    @Resource    private StudentMapper studentMapper;    public Student getStudentInfoByStudentId(String studentNo) {        return studentMapper.getStudentInfoByStudentId(studentNo);    }}