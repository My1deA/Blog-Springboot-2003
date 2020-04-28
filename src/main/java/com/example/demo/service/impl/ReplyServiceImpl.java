package com.example.demo.service.impl;

import com.example.demo.domain.Reply;
import com.example.demo.mapper.ReplyMapper;
import com.example.demo.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyServiceImpl implements ReplyService {

    @Autowired
    private ReplyMapper replyMapper;
    // 增
    @Override
    public void addReply(Reply reply) {
        replyMapper.addReply(reply);
    }
    // 删
    @Override
    public void delReply(Integer id) {
        replyMapper.delReply(id);
    }
    // 查
    @Override
    public Reply findReplyById(Integer id) {
        return replyMapper.findReplyById(id);
    }

    // 查询评论相关的部分回复
    @Override
    public List<Reply> findPartReplyByCommentId(Integer commentId) {
        return replyMapper.findPartReplyByCommentId(commentId);
    }

    // 查询评论相关的所有回复
    @Override
    public List<Reply> findAllReplyByCommentId(Integer commentId) {
        return replyMapper.findAllReplyByCommentId(commentId);
    }

    // 改
    @Override
    public void saveReply(Reply reply) {
        replyMapper.saveReply(reply);
    }
}
