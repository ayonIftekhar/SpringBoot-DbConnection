package com.example.SpringBoot.DatabaseConnection;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpringDataJpa
        extends JpaRepository<Courses,String> {

    List<Courses> findByAuthor(String author);
    List<Courses> findByName(String name);
}
