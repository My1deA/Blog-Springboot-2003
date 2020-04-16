package com.example.demo.user;

import com.example.demo.domain.User;
import com.example.demo.result.Result;
import com.example.demo.result.ResultUtil;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTests {
    @Autowired
    private UserService userService;

    /**
     * @name 用户测试
     * @Time 2020年4月4日17:41:13
     */
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
    void testDelUser(){
        userService.delUser(2);
    }
    @Test
    void testResultEnum(){
        Result result= ResultUtil.success(null);
        System.out.println(result);
    }

}
