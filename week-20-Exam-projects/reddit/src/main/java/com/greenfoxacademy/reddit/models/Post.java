package com.greenfoxacademy.reddit.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String title;
    private String url;
    private LocalDate timestamp;

    private Long score;

    public Post() {
    }

    public Post(String title) {
        this.title = title;
    }

    public Post(String title, String url) {
        this.title = title;
        this.url = url;
        timestamp = LocalDate.now();
        this.score = 0L;
    }

    public Post(String title, String url, Long score) {
        this.title = title;
        this.url = url;
        timestamp = LocalDate.now();
        this.score = score;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

}
