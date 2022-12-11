package com.school.service;

import com.school.models.Lecture;

public class LectureService {
    public static Lecture createLecture(int ID, int idCourse, String name) {
        return new Lecture(ID, idCourse, name);

    }
}


