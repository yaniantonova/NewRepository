package com.school.repository;

import com.school.models.Course;

public class CourseRepository {
    private final int STANDART_INIT_CAPACITY = 5;
    private Course[] lectures;

    public CourseRepository(Course[] lectures) {
        this.lectures = new Course[STANDART_INIT_CAPACITY];
    }
}
