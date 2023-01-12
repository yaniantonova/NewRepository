package com.school;

import com.school.models.Course;
import com.school.models.Lecture;
import com.school.repository.LectureRepository;
import com.school.service.CourseService;
import com.school.service.LectureService;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        LectureRepository testObject = new LectureRepository();
        System.out.println("Program is starting, we creating course and lectures");

        System.out.println("How many lectures create: ");
        testObject.addLectureInArray();
        CourseService.createCourse();
        System.out.println("Array capacity now is " + LectureRepository.getLectures().length);
        System.out.println("Number lectures are " + Lecture.getCounter() + " number courses are " + Course.getCounter());

        Scanner chooseTheNumber = new Scanner(System.in);
        System.out.println("Select number of action");
        System.out.println("1 - Show all objects in array");
        System.out.println("2 - Show element by ID");
        System.out.println("3 - Add object in array");
        System.out.println("4 - Delete element by ID");
        System.out.println("5 - Cancel");


        int action = chooseTheNumber.nextInt();
        switch (action) {

            case 1:
                testObject.getALL(LectureRepository.getLectures());
                chooseTheNumber.nextInt();
            case 2:
                testObject.getById(LectureRepository.getLectures(), 3);
                chooseTheNumber.nextInt();
            case 3:
                testObject.addObjectsInArray(LectureRepository.getLectures(), new Lecture());
                chooseTheNumber.nextInt();
            case 4:
                testObject.deleteById(LectureRepository.getLectures(), 2);
                chooseTheNumber.nextInt();
            case 5:
                System.out.println("The programm is off");
                break;

            default:
                System.out.println("Please choose variant action from 1 to 4");
                chooseTheNumber.nextInt();


        }


    }
}








