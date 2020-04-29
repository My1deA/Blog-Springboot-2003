package com.example.demo.service.impl;

import com.example.demo.domain.Comment;
import com.example.demo.domain.Reply;
import com.example.demo.mapper.CommentMapper;
import com.example.demo.service.CommentService;
import com.example.demo.service.ReplyService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Autowired
    private ReplyService replyService;//在其他Service引用其他方法 应该保留封装性 引入对应的Service

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

    // 查询评论
    @Override
    public List<Comment> findCommentByArticleId(Integer pageNum,Integer pageSize, Integer articleId) {
        PageHelper.startPage(pageNum,pageSize);
        List <Comment> commentList=commentMapper.findCommentByArticleId(articleId);
        List <Comment> updateList=new ArrayList<Comment>();
        //封装reply对象
        for(int i=0;i<commentList.size();i++){
            Comment comment=commentList.get(i);
            //调用replyService查询部分回复
            List<Reply> replyList=replyService.findPartReplyByCommentId(comment.getId());
            if(replyList!=null){
                comment.setReplyList(replyList);
            }
            updateList.add(comment);
        }
        //返回新的List
        return updateList;
    }



    // 改
    @Override
    public void saveComment(Comment comment) {
        commentMapper.saveComment(comment);
    }
}
