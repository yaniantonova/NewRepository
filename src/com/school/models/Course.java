package com.school.models;

public class Course<id> {
    private int id;

    public static int counterCourse;
    private String student;
    private String teacher;
    private String lecture;

    public Course(int id, String student, String teacher, String lecture) {
        this.id = id;
        this.student = student;
        this.teacher = teacher;
        this.lecture = lecture;
        counterCourse++;
    }


    public String getStudent() {
        return student;
    }

    public int getId() {
        return id;

    }

    public String getTeacher() {
        return teacher;
    }

    public String getLecture() {
        return lecture;
    }
}






