package com.school;

import com.school.models.Course;
import com.school.models.Lecture;
import com.school.models.Student;
import com.school.models.Teacher;
import com.school.service.CourseService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Course firstCourse = new Course(1, "Group_1", "Kovalenko", "Java");
        Lecture firstLecture = new Lecture(1, firstCourse.getId(), "theme 1");
        Lecture secondLecture = new Lecture(2, firstCourse.getId(), "theme 2");
        Lecture thirdLecture = new Lecture(3, firstCourse.getId(), "theme 3");
        Lecture fourthLecture = new Lecture(4, firstCourse.getId(), "theme 4");
        Lecture fifthLecture = new Lecture(5, firstCourse.getId(), "theme 5");
        Lecture sixthLecture = new Lecture(6, firstCourse.getId(), "theme 6");

        System.out.println(sixthLecture.idCourse);
        System.out.println(Lecture.counterLecture);


        Course secondCourse = new Course(2, "Group_2", "Melnyk", "Pyton");
        Course thirdCourse = new Course(3, "Group_3", "Levi", "Kotlin");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select number of your teacher");
        System.out.println("1 - Kovalenko");
        System.out.println("2 - Melnyk");
        System.out.println("3 - Levi");

        int teacher = scanner.nextInt();
        switch (teacher) {
            case 1:
                System.out.println("Kovalenko");
                break;
            case 2:
                System.out.println("Melnyk");
                break;
            case 3:
                System.out.println("Levi");
                break;
            default:
                System.out.println("This teacher is absent. Please, select teacher from the list");
                break;

        }
        System.out.println("You choose " + teacher);
        System.out.println("Do you want to create a new lecture?");
        System.out.println("Yes");
        System.out.println("No");
        String answer = scanner.next();
        switch (answer) {
            case "Yes":
                System.out.println("Yes");
                Lecture seventhLecture = new Lecture(7, 1, "theme 7");
                System.out.println(firstCourse.getId());
                System.out.println(Lecture.counterLecture);
                break;
            case "No":
                System.out.println("No");
                break;
            default:
                System.out.println("Please, answer");
                break;

        }
        System.out.println("Would you want to continue?");
        System.out.println("Yes");
        System.out.println("No");
        String answer2 = scanner.next();
        switch (answer2) {
            case "Yes":
                System.out.println("Yes");
                Lecture seventhLecture = new Lecture(7, 1, "theme 7");
                System.out.println(Lecture.counterLecture);
                break;
            case "No":
                System.out.println("No");
                break;
            default:
                System.out.println("Please, answer");
                break;
        }
        scanner.close();
    }

}
