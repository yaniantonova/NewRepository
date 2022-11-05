package com.school.models;

public class Course {
    private int id;
    public static int counterCourse;
    private Student student;
    private Teacher teacher;
    private Lecture lecture;

    public Course() {
        counterCourse++;


    }
}
