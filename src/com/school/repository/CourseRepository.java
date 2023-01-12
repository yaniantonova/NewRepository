package com.school.repository;

import com.school.models.Course;

public class CourseRepository {
    private final int STANDART_INIT_CAPACITY = 5;
    private Course[] courses;

    public CourseRepository(Course[] lectures) {
        this.courses = new Course[STANDART_INIT_CAPACITY];
    }


}
