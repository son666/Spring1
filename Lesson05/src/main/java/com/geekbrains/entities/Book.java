package com.geekbrains.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description_text")
    private String description_text;

    @Column(name = "year_manufacture")
    private int year_manufacture;


    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription_text() {
        return description_text;
    }

    public void setDescription_text(String description_text) {
        this.description_text = description_text;
    }

    public int getYear_manufacture() {
        return year_manufacture;
    }

    public void setYear_manufacture(int year_manufacture) {
        this.year_manufacture = year_manufacture;
    }

    @Override
    public String toString() {
        return "Book id=" + id + ", title=" + title + '}';
    }
}
