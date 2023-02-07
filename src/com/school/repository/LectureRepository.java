package com.school.repository;

import com.school.models.Lecture;

import java.util.Scanner;

public class LectureRepository extends DataRepository {
    private static int initCapacity = 5;

    // declare array an define its capacity
    private static Lecture[] lectures = new Lecture[initCapacity];

    public static Lecture[] getLectures() {
        return lectures;


    }


}























