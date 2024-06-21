package com.forwork.forwork.forum.publication;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Publication {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer publicationId;
    private Integer publicationDate, views;
    private String userName, title, header, content;
    public Integer getPublicationId() {
        return publicationId;
    }

    public void setPublicationId(Integer publicationId) {
        this.publicationId = publicationId;
    }

    public Integer getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Integer publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Publication() {
    }

    public Publication(String title, String header, String content) {
        this.title = title;
        this.header = header;
        this.content = content;
    }
}
