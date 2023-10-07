package com.zz.softwave.dubboconsumer.controller;

import com.zz.softwave.dubboprovider.domain.User;
import com.zz.softwave.dubboprovider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Describtion: UserController
 * @Author: 张卫刚
 * @Date: 2023/10/7 21:20
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user")
    public String userDetail(Integer id) {
        User user=userService.queryUserById(id);
        user.setName("user");
        return user.getName();
    }
}
