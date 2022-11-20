package com.school;

import com.school.models.Course;
import com.school.models.Lecture;

public class Main {
    public static void main(String[] args) {
        Course firstCourse = new Course(1);
        Lecture firstLecture = new Lecture(1, firstCourse.getId(),"theme 1");
        Lecture secondLecture = new Lecture(2, firstCourse.getId(),"theme 2");
        Lecture thirdLecture = new Lecture(3, firstCourse.getId(),"theme 3");
        Lecture fourthLecture = new Lecture(4, firstCourse.getId(),"theme 4");
        Lecture fifthLecture = new Lecture(5, firstCourse.getId(),"theme 5");
        Lecture sixthLecture = new Lecture(6, firstCourse.getId(),"theme 6");

        System.out.println(sixthLecture.idCourse);
        System.out.println(Lecture.counterLecture);
    }

}