package com.example.demo.service;

import com.example.demo.domain.Comment;

import java.util.List;

public interface CommentService {

    //  增
    void addComment(Comment comment);

    //  删
    void delComment(Integer id);

    //  查
    Comment findeCommentById(Integer id);
    // 查询评论
    List<Comment> findCommentByArticleId(Integer pageNum,Integer pageSize,Integer articleId);

    //  改
    void saveComment(Comment comment);
}
