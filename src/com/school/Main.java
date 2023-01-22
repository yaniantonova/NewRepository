package com.school;

import com.school.models.*;
import com.school.repository.LectureRepository;
import com.school.repository.PersonRepository;
import com.school.service.CourseService;
import com.school.service.LectureService;
import com.school.service.PersonService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LectureRepository testObject = new LectureRepository();
        System.out.println("Program is starting, we creating course and lectures");

        System.out.println("How many lectures create: ");
        testObject.addObjectsInArray(LectureRepository.getLectures(),new Lecture("name", 1));
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
                testObject.addObjectsInArray(LectureRepository.getLectures(), new Lecture("name",1));
                chooseTheNumber.nextInt();
            case 4:
                testObject.deleteById(LectureRepository.getLectures(), 2);
                chooseTheNumber.nextInt();
            case 5:
                System.out.println("The program is off");
                break;

            default:
                System.out.println("Please choose variant action from 1 to 5");
                chooseTheNumber.nextInt();


        }
        System.out.println("Next step. Select number of action");
        System.out.println("1 - Create new person card");
        System.out.println("2 - Show information from array");
        System.out.println("3 - Show all information about lecture");
        System.out.println("4 - Cancel");
        int action2 = chooseTheNumber.nextInt();
        PersonRepository testPerson = new PersonRepository();
        PersonService smPerson = new PersonService();
        Lecture smLecture = LectureService.createLecture();

        switch (action2) {

            case 1:
                smPerson.createPerson();
                testPerson.addObjectsInArray(PersonRepository.getPeople(), smPerson);
                chooseTheNumber.nextInt();
            case 2:
                testPerson.getALL(PersonRepository.getPeople());
                chooseTheNumber.nextInt();
            case 3:
                testObject.getById(LectureRepository.getLectures(),3);
                chooseTheNumber.nextInt();
            case 4:
                System.out.println("The program is off");
                break;
        }


    }

}