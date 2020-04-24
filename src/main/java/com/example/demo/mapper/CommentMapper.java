package com.example.demo.mapper;

import com.example.demo.domain.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CommentMapper {
//  增
    void addComment(Comment comment);

//  删
    void delComment(Integer id);

//  查
    Comment findeCommentById(Integer id);

//  改
    void saveComment(Comment comment);


}
