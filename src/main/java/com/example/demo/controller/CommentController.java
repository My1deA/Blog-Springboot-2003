package com.example.demo.controller;

import com.example.demo.domain.Comment;
import com.example.demo.result.Result;
import com.example.demo.result.ResultUtil;
import com.example.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    //添加评论
    @PostMapping("/add")
    public void addComment(@RequestBody  Comment comment){
        commentService.addComment(comment);
    }

    //查询评论
    @GetMapping("/find/{id}")
    public Result findComment(@PathVariable("id") Integer id){
        Comment comment=commentService.findeCommentById(id);
        return ResultUtil.success(comment);
    }
}
