package com.example.SpringBoot.DatabaseConnection;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJdbcRepository {
    @PersistenceContext
    private EntityManager repository;

    public void insert(Courses courses){
        repository.merge(courses);
    }

    public Courses findById(String id){
        return repository.find(Courses.class,id);
    }

    public void delete(String id){
        Courses courses = repository.find(Courses.class,id);
        repository.refresh(courses);
    }


//    @Autowired
//    private JdbcTemplate repository;

//    private String insertQuery = """
//            INSERT INTO COURSE(id,name,author) VALUES(?,?,?);
//            """;
//    private String selectQuery = """
//            SELECT * FROM COURSE WHERE id=? ;
//            """;
//    public void insert(){
//        repository.update(insertQuery,"1","CSE101","a");
//        repository.update(insertQuery,"2","CSE102","a2");
//        repository.update(insertQuery,"3","CSE103","a3");
//    }
//    public Courses select(){
//        return repository.queryForObject(selectQuery,
//                new BeanPropertyRowMapper<>(Courses.class)
//                ,"2");
//    }

}
