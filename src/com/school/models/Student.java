package com.school.models;

public class Student extends Data {
    private final int ID;
    private static int counter;

    public Student() {

        super();
        this.ID = counter + 1;
        counter++;
    }


}
