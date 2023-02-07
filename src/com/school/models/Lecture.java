package com.school.models;

import com.school.models.Course;

public class Lecture extends Data {

    private String homework;
    private String addition;
    private int personID = 0;
    private String description;


    public Lecture(String name, int personID) {
        super(name);
        personID++;
    }


    public int getPersonID() {
        return personID;
    }


    @Override
    public String toString() {
        return "Lecture{" +
                "ID=" + super.getID() +
                '}';
    }
}



