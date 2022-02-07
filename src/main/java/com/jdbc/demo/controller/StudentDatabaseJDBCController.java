package com.jdbc.demo.controller;

import com.jdbc.demo.dao.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface StudentDatabaseJDBCController {
    @PostMapping(value = "add/student")
    Student addNewStudent(@RequestBody Student student);

    @PostMapping("addall/students")
    Iterable<Student> addNewStudents(@RequestBody Iterable<Student> students);

    @GetMapping("get/student/{studentRollNumber}")
    Student getStudent(@PathVariable Integer studentRollNumber);

    @GetMapping("getall/students")
    Iterable<Student> getAllStudents();
}
