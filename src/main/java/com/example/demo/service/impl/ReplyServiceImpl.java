package com.example.demo.service.impl;

import com.example.demo.domain.Reply;
import com.example.demo.mapper.ReplyMapper;
import com.example.demo.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReplyServiceImpl implements ReplyService {

    @Autowired
    private ReplyMapper replyMapper;

    @Override
    public void addReply(Reply reply) {
        replyMapper.addReply(reply);
    }

    @Override
    public void delReply(Integer id) {
        replyMapper.delReply(id);
    }

    @Override
    public Reply findReplyById(Integer id) {
        return replyMapper.findReplyById(id);
    }

    @Override
    public void saveReply(Reply reply) {
        replyMapper.saveReply(reply);
    }
}
