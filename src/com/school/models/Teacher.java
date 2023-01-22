package com.school.models;

public class Teacher extends Person {
    private final int ID;
    private static int counter;

    public Teacher(String name, Role teacher) {
        super(name);
        this.ID = counter + 1;
        counter++;
    }

    public int getID() {
        return ID;
    }

    public static int getCounter() {
        return counter;
    }
}
