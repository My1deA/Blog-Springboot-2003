package com.example.demo.comment;

import com.example.demo.domain.Comment;
import com.example.demo.service.CommentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class CommentTests {

    @Autowired
    private CommentService commentService;

    // 增
    @Test
    void addCommentTest(){
        Comment comment=new Comment();
        comment.setArticleId(12);
        comment.setTime("2020-04-25 21:12:00");
        comment.setContent("2.0 测试comment 新增List 是否影响增删查改");
        commentService.addComment(comment);

        /*List<Reply> replyList=new ArrayList<Reply>();
        Reply reply=new Reply();
        reply.setToId(1);
        replyList.add(reply);
        comment.setReplyList(replyList);*/
    }

    // 查
    @Test
    void findCommentTest(){
        /*Comment comment=commentService.findeCommentById(2);
        System.out.println(comment);*/

        //查询评论
        List<Comment> commentList=commentService.findCommentByArticleId(1,3,12);
        System.out.println(commentList);
    }



    // 改
    @Test
    void saveCommentTest(){
        Comment comment=commentService.findeCommentById(1);
        comment.setContent("挺好的");
        commentService.saveComment(comment);
        comment=commentService.findeCommentById(1);
        System.out.println(comment);
    }

    // 删
    @Test
    void delCommentTest(){
        commentService.delComment(1);
    }
}
