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
        article.setUserId(1);
        article.setTitle("Mysql存储varchar转text");
        article.setType("Test");
        article.setTime("2020-04-24 13:32:58");
        article.setResume("更新Github的项目的Readme");
        article.setContent(" 基于Nathaniel Rich在《纽约时报》上发表的文章《The Lawyer Who Became DuPont’s Worst Nightmare》，" +
                "围绕罗伯特·比洛特展开，他担任辩护律师长达8年之久，他对化工巨头杜邦公司提起了环境诉讼，这场官司揭露了几十年来杜邦公司化学污染的历史 " +
                "拥有财富、名声、权力，这世界上的一切的男人 “海贼王”哥尔·D·罗杰，在被行刑受死之前说了一句话，让全世界的人都涌向了大海。“想要我的宝藏吗？" +
                " 如果想要的话，那就到海上去找吧，我全部都放在那里。”，世界开始迎接“大海贼时代”的来临 [10] 时值“大海贼时代”，为了寻找传说中海贼王罗杰所留下的大秘宝" +
                "“ONE PIECE”，无数海贼扬起旗帜，互相争斗。有一个梦想成为海贼王的少年叫路飞， 他因误食“恶魔果实”而成为了橡皮人，在获得超人能力的同时付出了一辈子无法游泳的" +
                "代价" + "。十年后，路飞为实现与因救他而断臂的香克斯的约定而出海， 他在旅途中不断寻找志同道合的伙伴，开始了以成为海贼王为目标的冒险旅程 [11]");
        article.setState("release");
        article.setPraise(0);
        articleService.addArticle(article);
    }
    @Test
    void TestFindArticleById(){
        Article article=articleService.findArticlebyId(11);
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
