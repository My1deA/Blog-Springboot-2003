package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.result.Result;
import com.example.demo.result.ResultUtil;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/login")
    public Result login(@RequestParam(value = "username") String username,
                        @RequestParam(value = "password") String password){
        System.out.println(username+"       "+password);
        User user=userService.findUserbyUsername(username);
        if(user.getPassword().equals(password)){
            return ResultUtil.success(user);
        }else{
            return ResultUtil.error(null);
        }

    }















    @GetMapping("/{id}")
    public User getUserbyId(@RequestParam Integer id){
        return userService.selectUserbyId(id);
    }
}
