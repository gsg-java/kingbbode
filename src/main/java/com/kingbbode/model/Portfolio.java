package com.kingbbode.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by YG-MAC on 2017. 9. 9..
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Portfolio {

    public Portfolio(String image) {
        this.image = image;
    }

    @Id
    @GeneratedValue
    private Long idx;

    private String title;

    private String content;

    private String image;
}
