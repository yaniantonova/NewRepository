package com.school.repository;

import com.school.models.Lecture;
import com.school.models.Person;
import com.school.models.Role;

public class PersonRepository extends AllRepository {
    private static int initCapacity = 5;

    // declare array an define its capacity
    private static Person[] people = new Person[initCapacity];

    public static Person[] getPeople() {
        return people;
    }

    @Override
    public void addObjectsInArray(Object[] arrays, Object object) {
        super.addObjectsInArray(arrays, object);
        int index = 0;
        if (index >= initCapacity) {
            makeArrayBigger();
        }
        people[index] = new Person(1,"name", Role.STUDENT);
        index++;
    }
    }

