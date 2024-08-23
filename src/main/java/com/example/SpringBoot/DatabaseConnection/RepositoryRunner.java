package com.example.SpringBoot.DatabaseConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class RepositoryRunner implements CommandLineRunner {
    @Autowired
    SpringDataJpa repository;
    @Override
    public void run(String... args) throws Exception {
        repository.save(new Courses("1","CSE101","CSE101"));
        repository.save(new Courses("2","CSE102","CSE102"));
        repository.save(new Courses("3","CSE103","CSE103"));

        repository.deleteById("1");

        System.out.println(repository.findByAuthor("CSE103"));
        System.out.println(repository.count());

    }

//---------------------------------------------------------------------------------------
    //    @Autowired
//    CourseJdbcRepository repository;
//
//    @Override
//    public void run(String... args) throws Exception {
//        repository.insert(new Courses("1","CSE101","CSE101"));
//        repository.insert(new Courses("2","CSE102","CSE102"));
//        repository.insert(new Courses("3","CSE103","CSE103"));
//
//        repository.delete("1");
//
//        System.out.println(repository.findById("2"));
//        System.out.println(repository.findById("3"));
//    }
//---------------------------------------------------------------------------------------
    //    @Override
//    public void run(String... args) throws Exception {
//        repository.insert();
//        System.out.println(repository.select());
//    }

}
