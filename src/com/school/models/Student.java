package com.school.models;

public class Student {
    private int id;
    private String name;
    public static int counterStudent;

    Student firstStudent = new Student(1,"Melnyk");
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        counterStudent++;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
