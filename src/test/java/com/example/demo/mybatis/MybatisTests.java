package com.example.demo.mybatis;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MybatisTests {

    @Autowired
    private UserService userService;


    @Test
    void testMybatis(){
        User user=userService.selectUserbyId(1);
        System.out.println(user);
    }

}
