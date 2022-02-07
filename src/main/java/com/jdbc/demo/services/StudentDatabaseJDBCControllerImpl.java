package com.jdbc.demo.services;

import com.jdbc.demo.controller.StudentDatabaseJDBCController;
import com.jdbc.demo.dao.entity.Student;
import com.jdbc.demo.dao.repository.StudentJDBCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentDatabaseJDBCControllerImpl implements StudentDatabaseJDBCController {
    @Autowired
    private StudentJDBCRepository studentJDBCRepository;

    @Override
    public Student addNewStudent(Student student) {
        return studentJDBCRepository.save(student);
    }

    @Override
    public Iterable<Student> addNewStudents(Iterable<Student> students) {
        return studentJDBCRepository.saveAll(students);
    }

    @Override
    public Student getStudent(Integer studentRollNumber) {
        return studentJDBCRepository.findById(studentRollNumber).orElse(new Student());
    }

    @Override
    public Iterable<Student> getAllStudents() {
        return studentJDBCRepository.findAll();
    }
}
