package com.school.service;

import com.school.models.Student;

//функція створення нового студента
public class StudentService {
    public static Student createStudent(int ID) {
        return new Student(ID);
    }
}
