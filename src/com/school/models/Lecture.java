package com.school.models;

import com.school.models.Course;

public class Lecture {
    private int id;
    private String name;
    private String homework;
    private String addition;
    public static int counterLecture;
    public int idCourse;

    public Lecture(int id, int idCourse, String name) {
        this.id = id;
        this.idCourse = idCourse;
        this.name = name;
        counterLecture++;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

}



