package com.example.demo.domain;



import java.io.Serializable;
import java.util.List;


public class Comment implements Serializable {
    private Integer id;         //评论id
    private Integer articleId;  //文章id
    private Integer userId;     //用户id
    private String content;     //文章内容
    private String time;        //时间
    private List<Reply> replyList; //回复列表

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<Reply> getReplyList() {
        return replyList;
    }

    public void setReplyList(List<Reply> replyList) {
        this.replyList = replyList;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", articleId=" + articleId +
                ", userId=" + userId +
                ", content='" + content + '\'' +
                ", time='" + time + '\'' +
                ", replyList=" + replyList +
                '}';
    }
}
