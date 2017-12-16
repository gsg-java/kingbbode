package com.kingbbode.model;

import com.kingbbode.enums.Category;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by YG-MAC on 2017. 9. 9..
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private Long idx;

    @Enumerated(EnumType.STRING)
    private Category category;

    private String title;

    private String content;

    private String image;
}
