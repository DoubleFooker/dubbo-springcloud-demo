package com.ognice.service;

import com.ognice.module.User;

/**
 * @author doubleFooker@gmail.com
 * 2019/7/7
 **/
public interface UserService {
    public User login(String username, String password);
}
