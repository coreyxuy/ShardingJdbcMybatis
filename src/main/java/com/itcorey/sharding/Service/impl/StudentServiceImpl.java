package com.itcorey.sharding.Service.impl;

import com.itcorey.sharding.Service.StudentService;
import com.itcorey.sharding.entity.Student;
import com.itcorey.sharding.mapper.StudentMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by ：Corey
 * 10:52 2018/8/15
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Resource
    public StudentMapper studentMapper;

    public boolean insert(Student student) {
        return studentMapper.insert(student) > 0 ? true : false;
    }
}
