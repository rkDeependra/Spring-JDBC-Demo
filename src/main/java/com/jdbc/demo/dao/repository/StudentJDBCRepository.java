package com.jdbc.demo.dao.repository;

import com.jdbc.demo.dao.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentJDBCRepository extends CrudRepository<Student, Integer> {
}
