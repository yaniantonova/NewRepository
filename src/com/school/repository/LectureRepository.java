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
    public void makeArrayBigger() {
        int newCapacity = initCapacity * 3 / 2 + 1;
        Lecture[] newLectures = new Lecture[newCapacity];
        System.arraycopy(lectures, 0, newLectures, 0, initCapacity);
        lectures = newLectures;
        initCapacity = newCapacity;
    }

    // add new lecture in array
    public void addLectureInArray() {
        Scanner scanner = new Scanner(System.in);
        int howManyObjects = scanner.nextInt();
        int index = 0;
        System.out.println("Program created 1 new course and " + howManyObjects + " new lectures");
        while (index < howManyObjects) {
            if (index >= initCapacity) {
                makeArrayBigger();
            }
            lectures[index] = new Lecture();
            index++;
        }

    }

}


















