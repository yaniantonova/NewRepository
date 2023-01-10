package com.school.repository;

import com.school.models.Lecture;

import java.util.Arrays;
import java.util.Scanner;

public class LectureRepository extends AllRepository {
    private static int initCapacity = 5;

    // declare array an define its capacity
    private static Lecture[] lectures = new Lecture[initCapacity];

    public static Lecture[] getLectures() {
        return lectures;


    }

    //  increase array with formula
    public static void makeArrayBigger() {
        int newCapacity = initCapacity * 3 / 2 + 1;
        Lecture[] newLectures = new Lecture[newCapacity];
        System.arraycopy(lectures, 0, newLectures, 0, initCapacity);
        lectures = newLectures;
        initCapacity = newCapacity;
    }

    // add new lecture in array
    public static void addLectureInArray() {
        Scanner scanner = new Scanner(System.in);
        int howManyLec = scanner.nextInt();
        int index = 0;
        System.out.println("Program created 1 new course and " + howManyLec + " new lectures");
        System.out.println("IDs: ");
        while (index <= howManyLec) {
            if (index >= initCapacity) {
                makeArrayBigger();
            }
            lectures[index] = new Lecture();
            index++;
            scanner.close();
        }

    }

//    public static void getById(Object [] objects, int numId) {
//        for (int i = 0; i < lectures.length; i++) {
//            if (i == numId) {
//                System.out.println("Method getById work: This element of array is " + lectures[i].toString());
//            }
//        }
//    }
}















