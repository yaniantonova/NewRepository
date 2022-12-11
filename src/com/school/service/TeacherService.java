package com.school.service;

import com.school.models.Teacher;

public class TeacherService {
    public static Teacher createTeacher(int ID, String name) {
        return new Teacher(ID, name);
    }
}