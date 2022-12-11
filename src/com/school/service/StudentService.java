package com.school.service;

import com.school.models.Student;

public class StudentService {
    public static Student createStudent(int ID, String name) {
        return new Student(ID, name);}
}
