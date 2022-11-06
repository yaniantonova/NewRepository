package com.school;

import com.school.models.Lecture;

public class Main {
    public static void main(String[] args) {
        Lecture firstLecture = new Lecture();
        Lecture secondLecture = new Lecture();
        Lecture thirdLecture = new Lecture();
        Lecture fourthLecture = new Lecture();
        Lecture fifthLecture = new Lecture();
        Lecture sixthLecture = new Lecture();

        System.out.println(Lecture.counterLecture);
    }

}