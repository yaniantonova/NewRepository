package com.school.repository;

import com.school.models.Lecture;

import java.util.Arrays;

public class AllRepository {

    public static void getALL(Object[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == null) {
                System.out.println("There are not all elements of array full");
            }
            System.out.println("Method getAll works: This element id is " + arrays[i].toString() + " ");
        }
    }


    public static void addObjectsInArray(Object[] arrays, Object object) {
        int index = 5;
        Object[] objects = new Object[index];
        if (arrays.length <= index) {
            int newIndex = index * 3 / 2 + 1;
            Object[] newArrays = new Object[newIndex];
            System.arraycopy(arrays, 0, newArrays, 0, index);
            arrays = newArrays;
            index = newIndex;
            ;
        }
        System.out.println("Method addObjectsInArray works: " + arrays[index].toString());
    }

    public static void getById(Object[] arrays, int numId) {
        for (int i = 0; i < arrays.length; i++) {
            if (i == numId) {
                System.out.println("Method getById works: This element of array is " + arrays[i].toString());
            }
        }
    }

    public static void deleteById() {

    }


}
