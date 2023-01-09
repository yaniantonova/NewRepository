package com.school;

import com.school.models.Course;
import com.school.models.Lecture;
import com.school.models.Student;
import com.school.models.Teacher;
import com.school.repository.LectureRepository;
import com.school.service.CourseService;
import com.school.service.LectureService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program is starting, we creating course and lectures");

        Course firstCourse = new Course();
        System.out.println("How many lectures create: ");
        LectureRepository.addLectureInArray();

        System.out.println("Array capacity now is " + LectureRepository.getLectures().length);
        System.out.println("Number lectures are " + Lecture.getCounter() + " number courses are " + Course.getCounter());
        System.out.println("ID Lecture in Array:");
        LectureService.printIdFromArray();
        System.out.println(firstCourse.getID());


    }

}









