package com.cl.service;

import com.cl.pojo.User;

public interface UserService {
    boolean isUserExist(String userName);

    boolean register(User user);

    boolean login(User user);
}
