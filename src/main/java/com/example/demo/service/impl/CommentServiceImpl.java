package com.example.demo.service.impl;

import com.example.demo.domain.Comment;
import com.example.demo.mapper.CommentMapper;
import com.example.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;

public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    // 增
    @Override
    public void addComment(Comment comment) {
        commentMapper.addComment(comment);
    }

    // 删
    @Override
    public void delComment(Integer id) {
        commentMapper.delComment(id);
    }


    // 查
    @Override
    public Comment findeCommentById(Integer id) {
        return commentMapper.findeCommentById(id);
    }

    // 改
    @Override
    public void saveComment(Comment comment) {
        commentMapper.saveComment(comment);
    }
}
