package com.example.demo.domain;

import java.io.Serializable;

public class Reply implements Serializable {
    private Integer id;         //回复id
    private Integer commentId;  //回复 此评论id
    private Integer replyId;    //回复 此回复id;
    private Integer fromId;     //回复者id
    private Integer toId;       //被回复者id
    private String content;     //回复内容
    private String time;        //时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public Integer getFromId() {
        return fromId;
    }

    public void setFromId(Integer fromId) {
        this.fromId = fromId;
    }

    public Integer getToId() {
        return toId;
    }

    public void setToId(Integer toId) {
        this.toId = toId;
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

    @Override
    public String toString() {
        return "Reply{" +
                "id=" + id +
                ", commentId=" + commentId +
                ", replyId=" + replyId +
                ", fromId=" + fromId +
                ", toId=" + toId +
                ", content='" + content + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
