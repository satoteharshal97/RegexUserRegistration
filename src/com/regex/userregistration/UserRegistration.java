package com.regex.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserRegistration regex  = new UserRegistration();
        System.out.println("Welcome to Java Regex");
        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();
        regex.checkFirstName(firstName);
    }

    private void checkFirstName(String firstName) {
        boolean value = Pattern.matches("[A-Z]{1}[a-zA-Z]{3,}", firstName);
        if (value) {
            System.out.println("Valid Name : " + firstName);
        } else {
            System.out.println("Invalid Name: " + firstName);
        }
    }
}
