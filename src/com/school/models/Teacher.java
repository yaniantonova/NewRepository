package com.school.models;

public class Teacher {
    private int id;
    public static int counterTeacher;

    public Teacher(int id) {
        this.id = id;
        counterTeacher++;

    }
}
