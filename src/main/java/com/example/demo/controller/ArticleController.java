package com.example.demo.controller;

import com.example.demo.domain.Article;
import com.example.demo.result.Result;
import com.example.demo.result.ResultUtil;
import com.example.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;


    @GetMapping(path = "/{id}")
    public Result getArticleById(@PathVariable("id") Integer id){
        Article article=articleService.findArticlebyId(id);

        return ResultUtil.success(null);
    }

}
