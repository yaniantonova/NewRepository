package com.school.models;

public class Teacher {
    private final int ID;
    private String name;
    public static int counterTeacher;

    Teacher firstTeacher = new Teacher(1,"Karol");
    public Teacher(int ID, String name) {
        this.ID = counterTeacher;
        this.name = name;
        counterTeacher++;

    }


    public int getId() {
        return ID;
    }

    public String getName() {
        return name;
    }
}
