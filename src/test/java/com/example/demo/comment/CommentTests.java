package com.example.demo.comment;

import com.example.demo.domain.Comment;
import com.example.demo.service.CommentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CommentTests {

    @Autowired
    private CommentService commentService;

    // 增
    @Test
    private void addCommentTest(){
        Comment comment=new Comment();
        comment.setArticleId(12);
        comment.setTime("2020-04-24 18:34:03");
        comment.setContent("写得不错");
        commentService.addComment(comment);
    }

    // 查
    @Test
    private void findCommentTest(){
        Comment comment=commentService.findeCommentById(1);
        System.out.println(comment);
    }

    // 改
    @Test
    private void saveCommentTest(){
        Comment comment=commentService.findeCommentById(1);
        comment.setContent("挺好的");
        commentService.saveComment(comment);
        comment=commentService.findeCommentById(1);
        System.out.println(comment);
    }

    // 删
    @Test
    private void delCommentTest(){

    }
}
