package com.example.demo;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.demo.domain.Article;
import com.example.demo.domain.User;
import com.example.demo.mapper.ArticleMapper;
import com.example.demo.result.Result;
import com.example.demo.result.ResultUtil;
import com.example.demo.service.ArticleService;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Timed;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private UserService userService;

    @Autowired
    private ArticleService articleService;

    /**
     * @name 文章测试
     * @Time 2020年4月11日17:41:13
     */
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
    void TestFindArticle(){
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


    /**
     * @name 用户测试
     * @Time 2020年4月4日17:41:13
     */
    @Test
    void testAddUser(){
        User user=new User();
        user.setUsername("xiaomi");
        user.setPassword("123");
        userService.addUser(user);
    }
    @Test
    void testFindUser(){
        User user=userService.findUserbyId(2);
        System.out.println(user);
    }
    @Test
    void testSaveUser(){
       User user=userService.findUserbyId(2);
       user.setPassword("321");
       userService.saveUser(user);
    }
    @Test
    void testDelUser(){
        userService.delUser(2);
    }
    @Test
    void testResultEnum(){
        Result result= ResultUtil.success(null);
        System.out.println(result);
    }

///------------------------------------------------------///

    @Test
    void testMybatis(){
        User user=userService.selectUserbyId(1);
        System.out.println(user);
    }



    @Test
    void contextLoads() {
    }

}
