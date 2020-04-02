package com.example.demo;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.demo.domain.User;
import com.example.demo.result.Result;
import com.example.demo.result.ResultUtil;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void testAddUser(){
        User user=new User();
        user.setUsername("xiaomi");
        user.setPassword("123");
        userService.addUser(user);
    }

    @Test
    void testFindUser(){
        User user=userService.findUserbyId(2);
        System.out.println(user);
    }

    @Test
    void testSaveUser(){
       User user=userService.findUserbyId(2);
       user.setPassword("321");
       userService.saveUser(user);
    }

    @Test
    void testResultEnum(){
        Result result= ResultUtil.success(null);
        System.out.println(result);
    }

///------------------------------------------------------///
    @Test
    void testDelUser(){
        userService.delUser(2);
    }


    @Test
    void testMybatis(){
        User user=userService.selectUserbyId(1);
        System.out.println(user);
    }



    @Test
    void contextLoads() {
    }

}
