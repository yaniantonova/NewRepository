package com.school.repository;

import com.school.models.Course;

public class CourseRepository extends DataRepository {
    private Course[] courses;

    public CourseRepository(Course[] courses) {
        this.courses = courses;
    }
}
