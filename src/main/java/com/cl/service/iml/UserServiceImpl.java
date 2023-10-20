package com.cl.service.iml;


import com.cl.mapper.UserMapper;
import com.cl.pojo.User;
import com.cl.pojo.UserExample;
import com.cl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean isUserExist(String userName) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        if (userName != null && !userName.trim().isEmpty()) {
            criteria.andUserNameEqualTo(userName);
        }
        List<User> users = userMapper.selectByExample(userExample);
        return !users.isEmpty();
    }

    @Override
    public boolean register(User user) {
        return userMapper.insertSelective(user) > 0;
    }

    @Override
    public boolean login(User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        if (user.getUserName() != null && !user.getUserName().trim().isEmpty()) {
            criteria.andUserNameEqualTo(user.getUserName());
        }
        if (user.getUserPassword() != null && !user.getUserPassword().trim().isEmpty()) {
            criteria.andUserPasswordEqualTo(user.getUserPassword());
        }
        List<User> users = userMapper.selectByExample(userExample);
        return !users.isEmpty();
    }

    @Override
    public User getUserByUserName(String userName) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        if (userName != null && !userName.trim().isEmpty()) {
            criteria.andUserNameEqualTo(userName);
        }
        List<User> users = userMapper.selectByExample(userExample);
        return users.get(0);
    }
}
