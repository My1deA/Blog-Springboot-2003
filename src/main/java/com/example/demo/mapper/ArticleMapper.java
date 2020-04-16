package com.example.demo.mapper;

import com.example.demo.domain.Article;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ArticleMapper {

    //--增
    void addArticle(Article article);

    //--删
    void delArticle(Integer id);

    //--查
    Article findArticlebyId(Integer id);
    //使用 pagehelper 查询文章 在service 层都是调用同一个接口 并且mapper的接口中无需 填写pageNum pageSize
    List<Article> findArticle();


    //--改
    void saveArticle(Article article);
}
