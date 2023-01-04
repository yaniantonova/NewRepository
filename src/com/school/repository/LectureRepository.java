package com.school.repository;

import com.school.models.Lecture;
import com.school.service.CourseService;
import com.school.service.LectureService;

public class LectureRepository {
    private static int initCapacity = 5;

    //оголошуємо масив і задаємо його місткість
    public static Lecture[] lectures = new Lecture[initCapacity];



    //  збільшення масиву за формулою
    public static void makeArrayBigger() {
        int newCapacity = initCapacity * 3 / 2 + 1;
        Lecture[] newLectures = new Lecture[newCapacity];
        System.arraycopy(lectures, 0, newLectures, 0, initCapacity);
        lectures = newLectures;
        initCapacity = newCapacity;
    }


}








