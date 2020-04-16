package com.example.demo.article;

import com.example.demo.domain.Article;
import com.example.demo.service.ArticleService;
import com.github.pagehelper.PageInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ArticleTests {

    @Autowired
    private ArticleService articleService;

    /**
     * @name 文章测试
     * @Time 2020年4月11日17:41:13
     */
    @Test
    void TestFindArticle(){
        //List<Article> list=articleService.findArticle(1,2);
        List<Article> list=articleService.findArticle(1,1);
        System.out.println(list);
    }

    @Test
    void TestFindArticle2(){
        PageInfo<Article> pageInfo =articleService.findArticle2(1,2);
        System.out.println(pageInfo);
    }

    @Test
    void TestAddArticle(){
        Article article=new Article();
        article.setUserId(2);
        article.setTitle("第一篇博客测试");
        article.setType("Test");
        article.setTime("2020-04-11");
        article.setResume("简短的helloWorld");
        article.setContent("Article后端测试");
        article.setState("release");
        article.setPraise(0);
        articleService.addArticle(article);
    }
    @Test
    void TestFindArticleById(){
        Article article=articleService.findArticlebyId(1);
        System.out.println(article);
    }
    @Test
    void TestSaveArticle(){
        Article article=articleService.findArticlebyId(1);
        article.setPraise(article.getPraise()+1);
        articleService.saveArticle(article);
    }
    @Test
    void TestDelArticle(){
        articleService.delArticle(1);
    }
}
