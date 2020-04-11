package com.example.demo.service.impl;

import com.example.demo.domain.Article;
import com.example.demo.mapper.ArticleMapper;
import com.example.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public void addArticle(Article article) {
        articleMapper.addArticle(article);
    }

    @Override
    public void delArticle(Integer id) {
        articleMapper.delArticle(id);
    }

    @Override
    public Article findArticlebyId(Integer id) {
        return articleMapper.findArticlebyId(id);
    }

    @Override
    public void saveArticle(Article article) {
        articleMapper.saveArticle(article);
    }
}
