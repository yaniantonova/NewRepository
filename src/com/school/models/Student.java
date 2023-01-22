package com.school.models;

public class Student extends Person {
    private final int ID;
    private static int counter;

    public Student(String name, Role role) {
        super(name);
        ID = counter + 1;
        counter++;
    }

    public int getID() {
        return ID;
    }

    public static int getCounter() {
        return counter;
    }
}
