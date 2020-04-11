package com.example.demo.mapper;

import com.example.demo.domain.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ArticleMapper {

    //增
    void addArticle(Article article);

    //删
    void delArticle(Integer id);

    //查
    Article findArticlebyId(Integer id);

    //改
    void saveArticle(Article article);
}
