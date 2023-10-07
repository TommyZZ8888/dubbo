package com.zz.softwave.dubboprovider.service;

import com.zz.softwave.dubboprovider.domain.User;
import org.springframework.stereotype.Service;

/**
 * @Describtion: UserService
 * @Author: 张卫刚
 * @Date: 2023/10/7 21:17
 */

@Service
public class UserService {

    public User queryUserById(Integer id) {

        User user=new User();
        user.setId(id);
        user.setName("张起灵");
        user.setAge(21);

        return user;
    }
}
