package com.example.demo.service;

import com.example.demo.domain.Reply;

public interface ReplyService {
    // 增
    void addReply(Reply reply);

    // 删
    void delReply(Integer id);

    // 查
    Reply findReplyById(Integer id);

    // 改
    void saveReply(Reply reply);
}
