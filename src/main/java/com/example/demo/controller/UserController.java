package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public String login(Integer id){
        User user=userService.findUserbyId(id);
        System.out.println(user);
        return "home.html";
    }



    @GetMapping("/{id}")
    public User getUserbyId(@RequestParam Integer id){
        return userService.selectUserbyId(id);
    }
}
