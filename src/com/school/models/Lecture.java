package com.school.models;

import com.school.models.Course;

public class Lecture extends Data {
    private final int ID;
    private static int counter;
    private String homework;
    private String addition;


    public Lecture() {
        super();
        this.ID = counter+1;
        counter++;
    }

    public int getID() {
        return ID;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "ID=" + ID +
                '}';
    }
}



