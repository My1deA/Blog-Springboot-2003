package com.example.demo.controller;

import com.example.demo.domain.Article;
import com.example.demo.result.Result;
import com.example.demo.result.ResultUtil;
import com.example.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;


    @GetMapping(path = "/show/{id}")
    public Result getArticleById(@PathVariable("id") Integer id){
        Article article=articleService.findArticlebyId(id);
        return ResultUtil.success(article);
    }


    @PostMapping(path = "/add")
    public Result addArticle(@RequestBody Article article){
        /*System.out.println(article);
        System.out.println("123");*/
        articleService.addArticle(article);
        return ResultUtil.success(null);
    }

}
