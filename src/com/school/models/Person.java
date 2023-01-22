package com.school.models;

public class Person extends Data {
    private static int counter = 0;
    private int ID;
    private int courseID;
    private Role role;

    public Person(int courseID, String name, Role role) {
        super(name);
        this.ID = counter;
        this.courseID = courseID;
        this.role = role;
        counter++;
    }


    public Person(String name) {
        super(name);

    }

    public static int getCounter() {
        return counter;
    }

    public int getID() {
        return ID;
    }

    public int getCourseID() {
        return courseID;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID=" + ID +
                ", courseID=" + courseID +
                ", role=" + role +
                '}';
    }
}
