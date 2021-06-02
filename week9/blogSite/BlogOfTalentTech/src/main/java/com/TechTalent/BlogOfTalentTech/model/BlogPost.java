package com.TechTalent.BlogOfTalentTech.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class BlogPost {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String title;
    private String author;
    private String BlogEntry;
    

    public BlogPost() {
        
    }

    public BlogPost(String title, String author, String blogEntry) {
    }

    public BlogPost(Long id, String title, String author, String blogEntry) {
        this.id = id;
        this.title = title;
        this.author = author;
        BlogEntry = blogEntry;
    }
    //    public BlogPost(Long id, String title, String author, String blogEntry) {
//        this.id = id;
//        this.title = title;
//        this.author = author;
//        BlogEntry = blogEntry;
//    }
}
