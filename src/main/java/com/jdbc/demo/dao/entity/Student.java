package com.jdbc.demo.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student implements Serializable {
    @Id
    private Integer rollNumber;

    private String firstName;

    private String middleName;

    private String lastName;

    private String studentsClass;

    private String section;

    private String address;

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentsClass='" + studentsClass + '\'' +
                ", section='" + section + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
