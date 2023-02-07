package com.school.repository;

import com.school.models.Data;
import com.school.models.Lecture;
import com.school.models.Person;

import java.util.Arrays;

public class DataRepository {
    private static int initCapacity = 5;
    private static Data[] data = new Data[initCapacity];

    public static Data[] getData() {
        return data;
    }

    public static int getInitCapacity() {
        return initCapacity;
    }

    Data testData = new Data("test");

    public String getALL(Data[] data) {
        try {
            System.out.println("Method getAll works: " + data);
        } catch (RuntimeException elementIsabsent) {
            System.out.println("This element in array doesn`t full yet");
        }
        return Arrays.toString(data);
    }


    public void makeArrayBigger() {
        int newCapacity = initCapacity * 3 / 2 + 1;
        Data[] newData = new Data[newCapacity];
        System.arraycopy(data, 0, newData, 0, initCapacity);
        data = newData;
        initCapacity = newCapacity;
    }

    public void add(Data object) {
        for (int i = 0; i < initCapacity; i++) {
            if (data[i] == null) {
                data[i] = object;
                System.out.println("Method add works: we added new object in array, its " + object.toString() + " , her index = " + i);
                break;
            } else if (i >= initCapacity) {
                makeArrayBigger();
            }

        }
    }

    public Data getById(int id) {
        for (Data data : data) ;
        {
            if (testData.getID() == id) {
                System.out.println("Method getById works: This element of array is " + testData);
            }
            return testData;
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


    public String getALL(Person[] data) {
        return Arrays.toString(data);
    }
}
