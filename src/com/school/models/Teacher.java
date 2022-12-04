package com.school.models;

public class Teacher {
    private int id;
    private String name;
    public static int counterTeacher;

    Teacher firstTeacher = new Teacher(1, "Shevchenko");

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
        counterTeacher++;

    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
