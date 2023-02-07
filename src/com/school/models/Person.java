package com.school.models;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person extends Data {
    private int courseID;
    private Role role;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    Scanner scanner = new Scanner(System.in);



    public Person(int courseID, String name, Role role, String firstName, String lastName, String email, String phoneNumber) {
        super(name);
        this.courseID = courseID;
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }


    public Person(String name) {
        super(name);

    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCourseID() {
        return courseID;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID=" + super.getID() +
                ", courseID=" + courseID +
                ", role=" + role + firstName + lastName + email + phoneNumber +
                '}';
    }
    public String validateNumber(String phoneNumber) {
        String example = phoneNumber;
        boolean validNum = example.matches("(\\+38)\\(0\\d{2}\\)\\d{3}-\\d{2}-\\d{2}");
        while (!validNum) {
            System.out.println("Phone Number must be in the format +38(0xx)xxx-xx-xx");
            example = scanner.next();
            validNum = example.matches("(\\+38)\\(0\\d{2}\\)\\d{3}-\\d{2}-\\d{2}");
        }
        return example;
    }
    public String validateEmail( String email) {
        String example = email;
        boolean validEmail = example.matches("\\w{3,}@\\D+\\.\\w+\\D");
        while (!validEmail) {
            System.out.println("Email must be in the format ***@domain");
            example = scanner.next();
            validEmail = example.matches("\\w{3,}@\\D+\\.\\w+\\D");
        }
        return example;
    }

    public String validateFirstName (String firstName) {
        String example = firstName;
        boolean validFirstName = example.matches("[A-z]{3,}");
        while (!validFirstName) {
            System.out.println("Firstname must include min 3 litera");
            example = scanner.next();
            validFirstName = example.matches( "[A-z]{3,}");
        }
        return example;
    }
    public String validateLastName (String lastName) {
        String example = lastName;
        boolean validLastName = example.matches("[A-z]{2,}");
        while (!validLastName) {
            System.out.println("Lastname must include min 2 litera");
            example = scanner.next();
            validLastName = example.matches("[A-z]{2,}");
        }
        return example;
    }

}


