package com.itcorey.sharding.entity;

import java.io.Serializable;

/**
 * Created by ：Corey
 * 10:49 2018/8/15
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 用户唯一标识
     */
    private Integer userId;

    /**
     * 用户名
     */
    private String name;

    /**
     * 用户年龄
     */
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userId=" + userId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
