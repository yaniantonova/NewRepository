package com.school.service;

import com.school.models.Teacher;

//функція створення нового студента
public class TeacherService {
    public static Teacher createTeacher(int ID) {
        return new Teacher(ID);
    }
}