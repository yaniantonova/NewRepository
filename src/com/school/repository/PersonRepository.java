package com.school.repository;

import com.school.models.Person;

import java.util.Arrays;

public class PersonRepository extends DataRepository {
    private static int initCapacity = 5;

    // declare array an define its capacity
    private static Person[] people = new Person[initCapacity];

    public static Person[] getPeople() {
        return people;
    }

    @Override
    public String getALL(Person[] people) {
        return Arrays.toString(people);
    }
}

