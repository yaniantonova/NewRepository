package com.school.service;

import com.school.models.Role;
import com.school.models.Person;
import com.school.models.Student;
import com.school.models.Teacher;
import com.school.service.StudentService;
import com.school.service.TeacherService;

import java.util.Scanner;

import static com.school.models.Role.STUDENT;
import static com.school.models.Role.TEACHER;

public class PersonService extends MainService {

    public void createPerson() {
        System.out.println("Would you want to create a new person card: 1)Student or 2)Teacher?. Please choose the number.");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        switch (answer) {
            case 1:
                Person student = new Person(1,"Antonova Yana", STUDENT);
                System.out.println("You created new student: name - " + student.getName() + ", course ID - " + student.getCourseID() + ", person ID - " + student.getID() + ", role - "+ student.getRole());
                break;
            case 2:
                Person teacher = new Person(1,"Kovalenko",TEACHER);
                System.out.println("You created new teacher: name - " + teacher.getName() + "course ID - " + teacher.getCourseID() + ", person ID - " + teacher.getID() + ", role - " + teacher.getRole());
                break;
            default:
                System.out.println("Please choose 1 or 2 variant");
                scanner.nextInt();

        }


    }
}
