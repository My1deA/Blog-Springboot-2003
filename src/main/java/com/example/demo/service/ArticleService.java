package com.example.demo.service;

import com.example.demo.domain.Article;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ArticleService {
    //--增
    void addArticle(Article article);

    //--删
    void delArticle(Integer id);

    //--查
    Article findArticlebyId(Integer id);
    //使用 pagehelper 查询文章     需要填写 pageNum 以及 pageSize去调用 pagehelper
    List<Article> findArticle(Integer pageNum,Integer pageSize);
    //使用 pagehelper 并用 pageinfo 保存;
    PageInfo<Article> findArticle2(Integer pageNum, Integer pageSize);

    //--改
    void saveArticle(Article article);
}
