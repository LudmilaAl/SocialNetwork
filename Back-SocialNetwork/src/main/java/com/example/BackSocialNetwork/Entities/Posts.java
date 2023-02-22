package com.example.BackSocialNetwork.Entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Posts {
    //Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinTable(  name = "user_posts",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "post_id"))
    private User user;
    private String content;
    private Integer likes;
    private Integer comments;
    private Integer reposts;
    private Date date;

    //Constructors
    public Posts() {
    }

    public Posts(Long id, User user, String content, Integer likes,
                 Integer comments, Integer reposts, Date date) {
        this.id = id;
        this.user = user;
        this.content = content;
        this.likes = likes;
        this.comments = comments;
        this.reposts = reposts;
        this.date = date;
    }

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer comments) {
        this.comments = comments;
    }

    public Integer getReposts() {
        return reposts;
    }

    public void setReposts(Integer reposts) {
        this.reposts = reposts;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
