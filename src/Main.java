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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program is starting, we creating course and lectures");

        Course firstCourse = new Course();
        System.out.println("How many lectures create: ");
        int howManyLec = scanner.nextInt();
        int x = 0;
        System.out.println("Program created 1 new course and " + howManyLec + " new lectures");
        System.out.println("IDs: ");
        while (x < howManyLec) {
            if (x >= LectureRepository.lectures.length) {
                LectureRepository.makeArrayBigger();
            }
            LectureRepository.lectures[x] = new Lecture();
            x++;
        }
        System.out.println("Array capacity now is " + LectureRepository.lectures.length);
        System.out.println("ID Lecture in Array:");
        LectureService.printIdFromArray();


    }

}









