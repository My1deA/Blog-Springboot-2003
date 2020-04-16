package com.example.demo.service.impl;

import com.example.demo.domain.Article;
import com.example.demo.mapper.ArticleMapper;
import com.example.demo.service.ArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    //--增加
    @Override
    public void addArticle(Article article) {
        articleMapper.addArticle(article);
    }

    //--删除
    @Override
    public void delArticle(Integer id) {
        articleMapper.delArticle(id);
    }

    //--查询
    @Override
    public Article findArticlebyId(Integer id) {
        return articleMapper.findArticlebyId(id);
    }

    //使用pagehelper 查询文章 都是调用Mapper同一个接口 只是返回的内容是否需要 pageinfo再次封装
    @Override
    public List<Article> findArticle(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
       /* List<Article> list=articleMapper.findArticle();*/
        return articleMapper.findArticle();
    }
    //返回的内容用 pageinfo再次封装
    @Override
    public PageInfo<Article> findArticle2(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Article> list=articleMapper.findArticle();
        PageInfo<Article> pageInfo=new PageInfo<Article>(list);
        return pageInfo;
    }

    //--修改
    @Override
    public void saveArticle(Article article) {
        articleMapper.saveArticle(article);
    }
}
