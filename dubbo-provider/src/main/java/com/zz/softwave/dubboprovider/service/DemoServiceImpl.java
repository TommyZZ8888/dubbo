package com.zz.softwave.dubboprovider.service;

import com.zz.softwave.dubbointerface.service.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @Describtion: UserService
 * @Author: 张卫刚
 * @Date: 2023/10/7 21:17
 */

@DubboService
public class DemoServiceImpl implements DemoService {


    @Override
    public String sayHello(String name) {
        return "Hello "+ name;
    }
}
