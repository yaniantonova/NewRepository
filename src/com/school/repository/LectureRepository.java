package com.school.repository;

import com.school.models.Lecture;
import com.school.service.CourseService;
import com.school.service.LectureService;

import java.util.Scanner;

public class LectureRepository {
    private static int initCapacity = 5;

    //оголошуємо масив і задаємо його місткість
    private static Lecture[] lectures = new Lecture[initCapacity];

    public static Lecture[] getLectures() {
        return lectures;


    }

    //  збільшення масиву за формулою
    public static void makeArrayBigger() {
        int newCapacity = initCapacity * 3 / 2 + 1;
        Lecture[] newLectures = new Lecture[newCapacity];
        System.arraycopy(lectures, 0, newLectures, 0, initCapacity);
        lectures = newLectures;
        initCapacity = newCapacity;
    }

    public static void addLectureInArray() {
        Scanner scanner = new Scanner(System.in);
        int howManyLec = scanner.nextInt();
        int x = 0;
        System.out.println("Program created 1 new course and " + howManyLec + " new lectures");
        System.out.println("IDs: ");
        while (x <= howManyLec) {
            if (x > LectureRepository.getLectures().length | x == LectureRepository.getLectures().length) {
                LectureRepository.makeArrayBigger();
            }
            LectureRepository.getLectures()[x] = new Lecture();
            x++;
            scanner.close();
        }


    }

}











