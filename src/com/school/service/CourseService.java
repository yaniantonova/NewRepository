package com.school.service;

import com.school.models.Course;

public class CourseService {
    public static Course createCourse(int ID, String student, String teacher, String lecture) {
        return new Course(ID, student, teacher, lecture);
    }
}