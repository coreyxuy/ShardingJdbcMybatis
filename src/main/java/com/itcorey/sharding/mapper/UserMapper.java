package com.itcorey.sharding.mapper;

import com.itcorey.sharding.entity.User;

import java.util.List;

/**
 * Created by ：Corey
 * 10:50 2018/8/15
 */
public interface UserMapper {


    Integer insert(User u);

    List<User> findAll();

    List<User> findByUserIds(List<Integer> userIds);
}
