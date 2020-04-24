package com.example.demo.service;

import com.example.demo.domain.Comment;

public interface CommentService {

    //  增
    void addComment(Comment comment);

    //  删
    void delComment(Integer id);


    //  查
    Comment findeCommentById(Integer id);

    //  改
    void saveComment(Comment comment);
}
