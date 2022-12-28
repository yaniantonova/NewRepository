package com.school.models;

public class Course {
    private final int ID;

    public static int counterCourse;
    private String student;
    private String teacher;
    private String lecture;

    public Course(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Course {" + "id=" + ID + "}";
    }

    public Course( int ID, String student, String teacher, String lecture){
            this.ID = counterCourse;
            this.student = student;
            this.teacher = teacher;
            this.lecture = lecture;
            counterCourse++;
        }


        public String getStudent () {
            return student;
        }

        public int getId () {
            return ID;

        }

        public String getTeacher () {
            return teacher;
        }

        public String getLecture () {
            return lecture;
        }
    }






