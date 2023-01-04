package com.school.service;

import com.school.models.Course;

// функція створення нового курсу
public class CourseService {
    public static Course createCourse() {
        return new Course();
    }
}