package com.ognice.service;

import com.ognice.module.User;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>Title: UserServiceImpl</p>
 * <p>Description:  </p>
 *
 * @author huangkaifu
 * @date 2019/7/7
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User login(String username, String password) {
        // TODO
        return new User().setUsername("dubbo-nacos").setPassword("***").setAge(18).setIdCard("40000XXXXXX");
    }
}
