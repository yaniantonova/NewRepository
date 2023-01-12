package com.school.models;

public class Course extends Data {
    private final int ID;
    private static int counter;
    private String student;
    private String teacher;
    private String lecture;

    public Course() {
        super();
        this.ID = counter + 1;
        counter++;
        this.student = student;
        this.teacher = teacher;
        this.lecture = lecture;

    }

    public int getID() {
        return ID;
    }

    public static int getCounter() {
        return counter;
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

    //метод для переведеня хеш-коду об'єкта в стрінг'
    @Override
    public String toString() {
        return "Course{" +
                "ID=" + ID +
                '}';
    }
}






