package com.itcorey.sharding.Service;

import com.itcorey.sharding.entity.User;

import java.util.List;

/**
 * Created by ：Corey
 * 10:51 2018/8/15
 * 处理用户的service
 */
public interface UserService {

    public boolean insert(User u);

    public List<User> findAll();

    public List<User> findByUserIds(List<Integer> ids);

    public void transactionTestSucess();

    public void transactionTestFailure() throws IllegalAccessException;
}
