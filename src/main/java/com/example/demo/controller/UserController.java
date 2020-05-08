package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.result.Result;
import com.example.demo.result.ResultUtil;
import com.example.demo.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
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

        Subject subject=SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken(username,password);
        //token.setRememberMe(true);

        try{
            subject.login(token);
            return ResultUtil.success(null);
        }catch (AuthenticationException e){
            return ResultUtil.error(null);
        }

    }

    @PostMapping("/register")
    public Result register(@RequestParam(value = "username") String username,
                        @RequestParam(value = "password") String password){

        //生成盐值
        String salt=new SecureRandomNumberGenerator().nextBytes().toString();
        //设置hash迭代次数
        int times=2;
        //获取迭代后的hash密码
        String encodePassword=new SimpleHash("md5",password,salt,times).toString();

        User user=new User();
        user.setUsername(username);
        user.setSalt(salt);
        user.setPassword(encodePassword);

        userService.addUser(user);
        return ResultUtil.success(user);
    }

    //注解验角色和权限
    /*@RequiresRoles("admin")
    @RequiresPermissions("add")*/
    @PostMapping("/logout")
    public Result logout(){
        Subject subject = SecurityUtils.getSubject();
        subject.logout();

        return ResultUtil.success(null);
    }













    @GetMapping("/{id}")
    public User getUserbyId(@RequestParam Integer id){
        return userService.selectUserbyId(id);
    }
}
