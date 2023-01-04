package com.school.models;

import com.school.models.Course;

public class Lecture {
    private final int ID;
    private String name;
    private String homework;
    private String addition;
    public static int counterLecture = 0;
    public int idCourse;

    public Lecture() {
        this.ID = counterLecture+1;
        counterLecture++;
    }

    //метод для переведеня хеш-коду об'єкта в стрінг'
    @Override
    public String toString() {
        return "Lecture {" + "id=" + ID + "}";
    }

    public Lecture( int ID, int idCourse, String name){
            this.ID = counterLecture+1;
            this.idCourse = idCourse;
            this.name = name;
            counterLecture++;
        }


        public int getID () {
            return ID;
        }

        public String getName () {
            return name;
        }

    }



