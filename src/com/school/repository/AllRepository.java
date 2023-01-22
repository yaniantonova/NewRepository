package com.school.repository;

import com.school.models.Lecture;

import java.util.Arrays;

public class AllRepository {
    private static int initCapacity = 5;
    private static AllRepository[] allRepositories = new AllRepository[initCapacity];

    public static AllRepository[] getAllRepositories() {
        return allRepositories;
    }

    public static int getInitCapacity() {
        return initCapacity;
    }

    public void getALL(Object[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
//            if (arrays[i] == null) {
//                System.out.println("There are not all elements of array full");
//            }
            try {
                System.out.println("Method getAll works: This element id is " + arrays[i].toString() + " ");
            } catch (RuntimeException elementIsabsent) {
                System.out.println("This element in array doesn`t full yet");
            }
        }
    }

    public void makeArrayBigger() {
        int newCapacity = initCapacity * 3 / 2 + 1;
        AllRepository[] newAllRepositories = new AllRepository[newCapacity];
        System.arraycopy(allRepositories, 0, newAllRepositories, 0, initCapacity);
        allRepositories = newAllRepositories;
        initCapacity = newCapacity;
    }

    public void addObjectsInArray(Object[] arrays, Object object) {
        int index = 0;
        if (index > initCapacity) {
            makeArrayBigger();
        }
        allRepositories[index] = new AllRepository();
        index++;

        System.out.println("Method addObjectsInArray works: we added new object in array, its " + object.toString() + " , her index = " + index);
    }

    public void getById(Object[] arrays, int index) {
        for (int i = 0; i < arrays.length; i++) {
            if (i == index) {
                System.out.println("Method getById works: This element of array is " + arrays[i].toString());
            }
        }
    }

    public void deleteById(Object[] arrays, int index) {
        Object[] newArrays = new Object[arrays.length - 1];
        int remainingElements = arrays.length - (index + 1);
        System.arraycopy(arrays, 0, newArrays, 0, index);
        System.arraycopy(arrays, index + 1, newArrays, index, remainingElements);
        System.out.println("Method deleteById works: We deleted element " + index + " from array.");
        System.out.println("Now our array include: " + Arrays.toString(newArrays));


    }


}
