package com.example.demo.domain;

import java.io.Serializable;

public class Article implements Serializable {
    private Integer id;         //文章id
    private Integer userId;     //发布用户id
    private String title;       //题目
    private String type;        //类型 ： spring/ html/ css?
    private String time;        //发布时间
    private String resume;      //简介
    private String content;     //内容
    private String state;       //状态 release draft recycle
    private Integer praise;       //点赞数

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getPraise() {
        return praise;
    }

    public void setPraise(Integer praise) {
        this.praise = praise;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", time='" + time + '\'' +
                ", resume='" + resume + '\'' +
                ", content='" + content + '\'' +
                ", state='" + state + '\'' +
                ", praise=" + praise +
                '}';
    }
}
