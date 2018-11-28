package com.itcorey.sharding.mapper;

import com.itcorey.sharding.entity.Student;

import java.util.List;

/**
 * Created by ：Corey
 * 10:49 2018/8/15
 * 处理用户数据操作接口
 */
public interface StudentMapper {

    Integer insert(Student s);

    List<Student> findAll();

    List<Student> findByStudentIds(List<Integer> studentIds);
}
