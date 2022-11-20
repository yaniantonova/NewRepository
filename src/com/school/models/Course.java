package com.school.models;

public class Course<id> {
    private int id;

    public static int counterCourse;
    private Student student;
    private Teacher teacher;
    private Lecture lecture;

    public Course(int id) {
        this.id = id;
        counterCourse++;

    }

    public int getId() {
        return id;
    }


}
