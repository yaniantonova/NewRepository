package com.school;

import com.school.models.*;
import com.school.repository.DataRepository;
import com.school.repository.LectureRepository;
import com.school.repository.PersonRepository;
import com.school.service.CourseService;
import com.school.service.LectureService;
import com.school.service.PersonService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("name");
        DataRepository testData = new DataRepository();
        System.out.println("Program is starting, we creating course and lectures");

        System.out.println("How many lectures create: ");
        Lecture lecture = LectureService.createLecture("Trial lecture", 1);
        testData.add(lecture);
        CourseService.createCourse();
        System.out.println("Array capacity now is " + LectureRepository.getLectures().length);
        System.out.println("Number lectures are " + Lecture.getCounter() + " number courses are " + Course.getCounter());

        PersonRepository testPerson = new PersonRepository();
        PersonService personService = new PersonService();
        Lecture smLecture = LectureService.createLecture("test1", person.getID());

        Scanner chooseTheNumber = new Scanner(System.in);

        System.out.println("Welcome to Online school!");
        Boolean checkContinueWorking = true;
        while (checkContinueWorking.equals(true)) {
            System.out.println("Select number of action");
            System.out.println("1 - Show all lectures in array");
            System.out.println("2 - Show element by ID");
            System.out.println("3 - Add object in array");
            System.out.println("4 - Delete element by ID");
            System.out.println("5 - Create new person card");
            System.out.println("6 - Show information from array");
            System.out.println("7 - Cancel");
            int action = chooseTheNumber.nextInt();
            switch (action) {
                case 1:
                    testData.getALL(LectureRepository.getLectures());
                    break;
                case 2:
                    testData.getById(1);
                    break;
                case 3:
                    Lecture lecture1 = LectureService.createLecture("chemical", person.getID());
                    testData.add(lecture1);
                    break;
                case 4:
                    testData.deleteById(LectureRepository.getLectures(), 2);
                    break;
                case 5:
                    Person smPerson = personService.createPerson();
                    testPerson.add(smPerson);
                    break;
                case 6:
                    System.out.println(testPerson.getALL(DataRepository.getData()));
                    break;
                case 7:
                    System.out.println("The program is off");
                    checkContinueWorking = false;
                    break;
                default:
                    System.out.println("Please choose variant action from 1 to 8");
                    break;
            }
        }


    }


}
