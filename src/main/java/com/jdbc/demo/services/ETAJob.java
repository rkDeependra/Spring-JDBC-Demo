package com.jdbc.demo.services;

import com.jdbc.demo.controller.StudentDatabaseJDBCController;
import com.jdbc.demo.dao.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ETAJob {
    @Autowired
    private StudentDatabaseJDBCController studentDatabaseJDBCController;

    //    @PostConstruct
    void insertRecords() {
        long startTime = System.currentTimeMillis();
        System.out.println("startTime " + startTime);
        for (int i = 0; i <= 1000; i++) {
            Student student = new Student();
            student.setFirstName("John");
            student.setLastName("Alice");
            student.setStudentsClass(String.valueOf(i % 10));
            student.setAddress("California");
            if (i % 100 == 0) {
                System.out.println("Total Time consumed By Spring JDBC module in inserting " + i + " records with SQL IDENTITY(1,1) auto increment is " + (System.currentTimeMillis() - startTime));
            }
            studentDatabaseJDBCController.addNewStudent(student);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("endTime " + endTime);
    }

    //    @PostConstruct
    void batchInsertRecords() {
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);

        for (int i = 1; i <= 10; i++) {
            List<Student> studentList = new ArrayList<>();
            for (int j = 1; j <= 100; j++) {
                Student student = new Student();
                student.setFirstName("Alice");
                student.setLastName("John");
                student.setStudentsClass("6");
                student.setAddress("California");
                studentList.add(student);
            }
            studentDatabaseJDBCController.addNewStudents(studentList);
            System.out.println("Total Time consumed By Spring JDBC module in inserting " + (i * 100) + " records with auto sql IDENTITY(1,1) auto increment and Batch of 100 is " + (System.currentTimeMillis() - startTime));
        }

        System.out.println(System.currentTimeMillis() - startTime);
    }
}
