package com.school.models;

import com.school.models.Course;

public class Lecture {
    private final int ID;
    private String name;
    private String homework;
    private String addition;
    public static int counterLecture;
    public int idCourse;

    public Lecture(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Lecture {" + "id=" + ID + "}";
    }

    public Lecture( int ID, int idCourse, String name){
            this.ID = counterLecture;
            this.idCourse = idCourse;
            this.name = name;
            counterLecture++;
        }


        public int getId () {
            return ID;
        }

        public String getName () {
            return name;
        }

    }



