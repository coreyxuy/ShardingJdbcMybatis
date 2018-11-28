package com.itcorey.sharding.test;

import com.itcorey.sharding.Service.StudentService;
import com.itcorey.sharding.Service.UserService;
import com.itcorey.sharding.entity.Student;
import com.itcorey.sharding.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ：Corey
 * 11:19 2018/8/15
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:config/spring/spring-database.xml", "classpath*:config/spring/spring-sharding.xml" })
public class SharingJdbcMybatisTest {

    @Resource
    public UserService userService;

    @Resource
    public StudentService studentService;

    @Test
    public void testUserInsert() {
        User u = new User();
        u.setUserId(30);
        u.setAge(25);
        u.setName("徐勇平");
        Assert.assertEquals(userService.insert(u), true);
    }

    @Test
    public void testStudentInsert() {
        Student student = new Student();
        student.setStudentId(30);
        student.setAge(21);
        student.setName("徐卖狼");
        Assert.assertEquals(studentService.insert(student), true);
    }

    @Test
    public void testFindAll(){
        List<User> users = userService.findAll();
        if(null != users && !users.isEmpty()){
            for(User u :users){
                System.out.println("===============================>"+u);
            }
        }
    }

    @Test
    public void testSQLIN(){
        List<User> users = userService.findByUserIds(Arrays.asList(1));
        if(null != users && !users.isEmpty()){
            for(User u :users){
                System.out.println(u);
            }
        }
    }

    @Test
    public void testTransactionTestSucess(){
        userService.transactionTestSucess();
    }

    @Test(expected = IllegalAccessException.class)
    public void testTransactionTestFailure() throws IllegalAccessException{
        userService.transactionTestFailure();
    }


}
