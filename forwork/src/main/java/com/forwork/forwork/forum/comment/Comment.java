package com.forwork.forwork.forum.comment;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer commentUserId;
    private String nameComment;

    public Integer getCommentUserId() {
        return commentUserId;
    }

    public void setCommentUserId(Integer commentUserId) {
        this.commentUserId = commentUserId;
    }

    public String getNameComment() {
        return nameComment;
    }

    public void setNameComment(String nameComment) {
        this.nameComment = nameComment;
    }
}