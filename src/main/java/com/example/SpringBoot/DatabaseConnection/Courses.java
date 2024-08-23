package com.example.SpringBoot.DatabaseConnection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Entity(name="Course")
public class Courses {
    @Id
    private String id ;
    @Column
    private String name ;
    @Column(name = "author")
    private String author ;

    public Courses(String id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Courses(){}

    @Override
    public String toString() {
        return "Courses{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
