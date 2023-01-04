package com.school.models;

public class Course {
    private final int ID;

    public static int counterCourse;
    private String student;
    private String teacher;
    private String lecture;

    public Course() {
        this.ID = counterCourse+1;
        counterCourse++;
    }

//метод для переведеня хеш-коду об'єкта в стрінг'
    @Override
    public String toString() {
        return "Course {" + "id=" + ID + "}";
    }

    public Course( int ID, String student, String teacher, String lecture){
            this.ID = counterCourse+1;
            this.student = student;
            this.teacher = teacher;
            this.lecture = lecture;
            counterCourse++;
        }


        public String getStudent () {
            return student;
        }

        public int getID () {
            return ID;

        }

        public String getTeacher () {
            return teacher;
        }

        public String getLecture () {
            return lecture;
        }
    }






