package com.school.service;

import com.school.models.Course;

// create new course
public class CourseService extends MainService {
    public static Course createCourse() {
        return new Course("name");
    }
}