package com.example.demo.controller;

import com.example.demo.domain.Reply;
import com.example.demo.result.Result;
import com.example.demo.result.ResultUtil;
import com.example.demo.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/reply")
public class ReplyController {

    @Autowired
    private ReplyService replyService;

    //新增评论
    @PostMapping("/add")
    public void addReply(@RequestBody Reply reply){
        replyService.addReply(reply);
    }

    //新增评论
    @PostMapping("/find/{id}")
    public Result findReplybyId(@PathVariable("id") Integer id){
        Reply reply=replyService.findReplyById(id);
        return ResultUtil.success(reply);
    }
}
