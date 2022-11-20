package com.school.models;

public class Student {
    private int id;
    public static int counterStudent;

    public Student(int id) {
        this.id = id;
        counterStudent++;

    }
}
