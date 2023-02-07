package com.school.service;

import com.school.models.Role;
import com.school.models.Person;

import java.util.Scanner;

import static com.school.models.Role.STUDENT;

public class PersonService {


    public static Person createPerson() {
        Scanner scanner = new Scanner(System.in);
        Person testPerson = new Person("test");
        System.out.println("Name?");
        String name = scanner.next();
        System.out.println("Role? Write TEACHER or STUDENT");
        Role role = Role.valueOf(scanner.next());
        System.out.println("First name?");
        String valFirstName = scanner.next();
        String firstName = testPerson.validateFirstName(valFirstName);
        System.out.println("Last name?");
        String valLastName = scanner.next();
        String lastName = testPerson.validateLastName(valLastName);
        System.out.println("Email?");
        String valEmail = scanner.next();
        String email = testPerson.validateEmail(valEmail);
        System.out.println("Phone in format +38(0xx)xxx-xx-xx");
        String valPhone = scanner.next();
        String phone = testPerson.validateNumber(valPhone);
        if (role == STUDENT) {
            Person student = new Person(1, name, role, firstName, lastName, email, phone);
            System.out.println("You created new student: name - " + student.getName() + ", " +
                    " course ID - " + student.getCourseID() + ", person ID - " + student.getID() + ", role - " + student.getRole()
                    + ", first name and last name - " + student.getFirstName() + " " + student.getLastName() + ", his email is " + student.getEmail()
                    + ", his phone is " + student.getPhoneNumber());
            return student;
        } else {

            Person teacher = new Person(1, name, role, firstName, lastName, email, phone);
            System.out.println("You created new teacher: name - " + teacher.getName() +
                    ", course ID - " + teacher.getCourseID() + ", person ID - " + teacher.getID() + ", role - " + teacher.getRole());
            return teacher;

        }


    }


}

