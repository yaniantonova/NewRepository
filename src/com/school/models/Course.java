package com.school.models;

public class Course extends Data {

    private String student;
    private String teacher;
    private String lecture;

    public Course(String name) {
        super(name);
        this.student = student;
        this.teacher = teacher;
        this.lecture = lecture;

    }

    public String getStudent() {
        return student;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getLecture() {
        return lecture;
    }


    @Override
    public String toString() {
        return "Course{" +
                "ID=" + super.getID() +
                '}';
    }
}






