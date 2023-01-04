package com.school.models;

public class Student {
    private final int ID;
    private String name;
    public static int counterStudent;

    Student firstStudent = new Student(1, "Melnyk");

    public Student(int ID) {
        this.ID = counterStudent+1;
        counterStudent++;
    }
    //метод для переведеня хеш-коду об'єкта в стрінг'
    @Override
    public String toString() {
        return "Student {" + "id=" + ID + "}";
    }


    public Student(int ID, String name) {
        this.ID = counterStudent+1;
        this.name = name;
        counterStudent++;

    }

    public int getID() {

        return ID;
    }

    public String getName() {

        return name;
    }
}
