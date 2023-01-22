package com.school.service;

import com.school.models.Lecture;
import com.school.models.Teacher;
import com.school.repository.LectureRepository;

// create new lecture
public class LectureService  extends MainService {
    public static Lecture createLecture() {
        return new Lecture("name",1);

    }

    //show ID lectures from array
//    public static void printIdFromArray() {
//        for (int i = 0; i < Lecture.getCounter(); i++) {
//            if (LectureRepository.getLectures()[i] == null) {
//                System.out.println("There are not all elements of array full");
//            }
//            System.out.println("This element id is " + LectureRepository.getLectures()[i].getID() + " ");
//
//        }
//    }
    //

}