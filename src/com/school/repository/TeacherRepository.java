package com.school.repository;
import com.school.models.Teacher;

public class TeacherRepository extends AllRepository {
    private static int initCapacity = 5;

    // declare array an define its capacity
    private static Teacher[] teachers = new Teacher[initCapacity];

    public TeacherRepository() {

    }


    public static Teacher[] getTeachers() {
        return teachers;

    }

}
