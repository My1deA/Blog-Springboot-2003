package com.example.demo.mapper;

import com.example.demo.domain.Reply;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ReplyMapper {
    // 增
    void addReply(Reply reply);

    // 删
    void delReply(Integer id);

    // 查
    Reply findReplyById(Integer id);

    // 改
    void saveReply(Reply reply);

}
