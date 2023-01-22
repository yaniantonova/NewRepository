package com.school.service;

import com.school.models.Role;
import com.school.models.Student;

//create new student
public class StudentService extends PersonService {
    public static Student createStudent() {
        return new Student("name", Role.STUDENT);
    }
}
