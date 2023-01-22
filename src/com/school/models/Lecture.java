package com.school.models;

import com.school.models.Course;

public class Lecture extends Data {
    private final int ID;
    private static int counter;
    private String homework;
    private String addition;
    private int personID = 0;



    public Lecture(String name, int personID) {
        super(name);
        this.ID = counter;
        counter++;
        personID++;
    }

    public int getID() {
        return ID;
    }

    public static int getCounter() {
        return counter;
    }

    public int getPersonID() {
        return personID;
    }


    @Override
    public String toString() {
        return "Lecture{" +
                "ID=" + ID +
                '}';
    }
}



