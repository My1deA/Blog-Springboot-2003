package com.example.demo.service.impl;

import com.example.demo.domain.Reply;
import com.example.demo.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReplyServiceImpl implements ReplyService {

    @Autowired
    private ReplyService replyService;

    @Override
    public void addReply(Reply reply) {
        replyService.addReply(reply);
    }

    @Override
    public void delReply(Integer id) {
        replyService.delReply(id);
    }

    @Override
    public Reply findReplyById(Integer id) {
        return replyService.findReplyById(id);
    }

    @Override
    public void saveReply(Reply reply) {
        replyService.saveReply(reply);
    }
}
