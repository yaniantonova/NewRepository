package com.school.models;

public class Data {
    private String name;
    private final int ID;
    private static int counter;

    public Data(String name) {
        this.name = name;
        ID = counter;
        counter++;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }

    public int getID() {
        return ID;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Data.counter = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
