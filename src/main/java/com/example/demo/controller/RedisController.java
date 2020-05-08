package com.example.demo.controller;

import com.example.demo.result.Result;
import com.example.demo.result.ResultUtil;
import com.example.demo.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.sound.midi.Soundbank;


@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisUtil redisUtil;
    //http://localhost:8080/redis/set?key=id&value=123;
    //http://localhost:8080/redis/set?key=id&value=123456

    @GetMapping("/set")
    public boolean set(String key,String value){
        System.out.println("redis set "+key+" "+value);
        return redisUtil.set(key,value);
    }

    @GetMapping("/get")
    public Object get(String key){
        System.out.println("redis get");
        return redisUtil.get(key);
    }

    @GetMapping("/expire")
    public boolean expire(String key){
        System.out.println("redis expire");
        return redisUtil.expire(key,10);
    }

}
