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
    public Result addComment(@RequestBody  Comment comment){
        System.out.println(comment);
        //commentService.addComment(comment);
        return ResultUtil.success(null);
    }



    //查询评论
    @GetMapping("/find/{id}")
    public Result findComment(@PathVariable("id") Integer id){
        Comment comment=commentService.findeCommentById(id);
        return ResultUtil.success(comment);
    }


    //使用 qs 添加评论
    @PostMapping("/add2")
    public Result addComment(@RequestParam("articleId") Integer articleId,
                             @RequestParam("userId") Integer userId,
                             @RequestParam("time") String time,
                             @RequestParam("content") String content){
        System.out.println(articleId+" "+userId+" "+time+" "+content);
        //commentService.addComment(comment);
        return ResultUtil.success(null);
    }
}
