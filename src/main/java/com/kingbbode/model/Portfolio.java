package com.kingbbode.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by YG-MAC on 2017. 9. 9..
 */
@Entity
public class Portfolio {

    public Portfolio() {
    }

    public Portfolio(String image) {
        this.image = image;
    }

    @Id
    @GeneratedValue
    private Long idx;

    private String title;

    private String content;

    private String image;

    public Long getIdx() {
        return idx;
    }

    public void setIdx(Long idx) {
        this.idx = idx;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
