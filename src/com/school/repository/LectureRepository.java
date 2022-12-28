package com.school.repository;
import com.school.models.Lecture;
import com.school.service.LectureService;

public class LectureRepository  {
    private int initCapacity = 5;
    private Lecture[] lectures = new Lecture[initCapacity];
    private int currentIndex = 0;

    public LectureRepository() {
        this.lectures = new Lecture[initCapacity];
    }

    public LectureRepository(int inputCapacity) {

        if (inputCapacity < 0) {
            System.out.println("Wrong argument,creating standart capacity array");
            this.lectures = new Lecture[initCapacity];
        } else {
            this.lectures = new Lecture[inputCapacity];
        }
    }
    //  task3 - array can increment with formula
    public void makeArrayBigger() {
        int newCapacity = initCapacity * 3 / 2 + 1;
        Lecture [] newLectures = new Lecture[newCapacity];
        System.arraycopy(lectures, 0, newLectures, 0, initCapacity);
        lectures = newLectures;
        initCapacity = newCapacity;
    }
    //task 2 - add new lectures in array
    public void add() {
        if (currentIndex >= lectures.length) {
            makeArrayBigger();
            lectures[currentIndex++] = new Lecture(1,1,"name");
        }
    }
}

