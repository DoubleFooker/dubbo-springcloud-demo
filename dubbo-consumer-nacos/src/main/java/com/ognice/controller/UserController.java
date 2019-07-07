package com.ognice.controller;

import com.ognice.module.User;
import com.ognice.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

/**
 * <p>Title: UserController</p>
 * <p>Description:  </p>
 *
 * @author huangkaifu
 * @date 2019/7/7
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Reference( url = "dubbo://127.0.0.1:12345")
    UserService userService;

    @PostMapping("/login")
    @ResponseBody
    public User login(@RequestBody User user) {
        return userService.login(user.getUsername(), user.getPassword());
    }
}
