package com.school.models;

public class Teacher extends Data {
    private final int ID;
    private static int counter;

    public Teacher() {
        super();
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
