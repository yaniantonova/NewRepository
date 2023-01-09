package com.school.service;

import com.school.models.Lecture;
import com.school.repository.LectureRepository;

//функція створення нової лекції
public class LectureService {
    public static Lecture createLecture() {
        return new Lecture();

    }


    //виводимо айді лекцій з массиву
    public static void printIdFromArray() {
        for (int i = 0; i < LectureRepository.getLectures().length; i++) {
            if (LectureRepository.getLectures()[i] == null) {
                System.out.println("There are not all elements of array full");
            }
            System.out.println("This element id is " + LectureRepository.getLectures()[i].getID() + " ");

        }
    }
}