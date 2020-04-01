package com.example.demo;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void testMybatis(){
        User user=userService.selectUserbyId(1);
        System.out.println(user);
    }

    @Test
    void testAddUser(){
        User user=new User();
        user.setUsername("xiaomi");
        user.setPassword("123");
        userService.addUser(user);
    }

    @Test
    void contextLoads() {
    }

}
