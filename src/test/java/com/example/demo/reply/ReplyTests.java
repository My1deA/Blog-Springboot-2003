package com.example.demo.reply;

import com.example.demo.domain.Reply;
import com.example.demo.service.ReplyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ReplyTests {

    @Autowired
    private ReplyService replyService;

    // 增
    @Test
    void addReplyTest(){
        Reply reply=new Reply();
        reply.setCommentId(1);
        reply.setContent("+1");
        reply.setTime("2020-04-24 20:25:32");
        replyService.addReply(reply);
    }

    // 查
    @Test
    void findReplyTest(){
        Reply reply=replyService.findReplyById(1);
        System.out.println(reply);
    }

    @Test
    void findPartReplyTest(){
        List<Reply> replyList=replyService.findPartReplyByCommentId(1);
        System.out.println(replyList);
    }

    @Test
    void findAllReplyTest(){
        List<Reply> replyList=replyService.findAllReplyByCommentId(1);
        System.out.println(replyList);
    }

    // 改
    @Test
    void saveReplyTest(){
        Reply reply=replyService.findReplyById(1);
        reply.setToId(1);
        replyService.saveReply(reply);
        System.out.println(replyService.findReplyById(1));
    }

    // 删
    @Test
    void delReplyTest(){
        replyService.delReply(1);
    }
}
