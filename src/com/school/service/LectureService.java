package com.school.service;

import com.school.models.Lecture;

// create new lecture
public class LectureService {
    public static Lecture createLecture(String name, int id) {
        return new Lecture(name, id);

    }



}