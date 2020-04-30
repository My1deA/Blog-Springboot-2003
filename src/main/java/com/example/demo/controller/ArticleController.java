package com.example.demo.controller;

import com.example.demo.domain.Article;
import com.example.demo.result.Result;
import com.example.demo.result.ResultUtil;
import com.example.demo.service.ArticleService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;


    //添加文章
    @PostMapping(path = "/add")
    public Result addArticle(@RequestBody Article article){
        /*System.out.println(article);
        System.out.println("123");*/
        articleService.addArticle(article);
        return ResultUtil.success(null);
    }

    //添加文章
    @PostMapping(path = "/save")
    public Result saveArticle(@RequestBody Article article){
        /*System.out.println(article);
        System.out.println("123");*/
        articleService.saveArticle(article);
        return ResultUtil.success(null);
    }

    //展示文章界面
    @GetMapping(path = "/details/{id}")
    public Result findArticleById(@PathVariable("id") Integer id){
        Article article=articleService.findArticlebyId(id);
        return ResultUtil.success(article);
    }

    //查询文章使用 list<Article> 返回数据
    @GetMapping(path ="/list/{pageNum}/{pageSize}" )
    public List<Article> findArticle(@PathVariable("pageNum") Integer pageNum,
                                     @PathVariable("pageSize") Integer pageSize) {
        List<Article> list = articleService.findArticle(pageNum,pageSize);
        return list;

    }

    //查询文章使用 PageInfo<Article> 返回数据
    @GetMapping(path ="/list2/{pageNum}/{pageSize}" )
    public PageInfo<Article> findArticle2(@PathVariable("pageNum") Integer pageNum,
                                          @PathVariable("pageSize") Integer pageSize) {
        PageInfo<Article> pageInfo=articleService.findArticle2(pageNum,pageSize);
        return pageInfo;
    }


    
}
