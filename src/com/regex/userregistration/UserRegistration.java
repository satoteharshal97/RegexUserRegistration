package com.regex.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    private final static Scanner scanner = new Scanner(System.in);
    private final static UserRegistration regex = new UserRegistration();

    public static void main(String[] args) {
        System.out.println("Welcome to Java Regex");
        System.out.println("Choose an appropriate option: ");
        boolean check = true;
        while (check) {
            System.out.println("Select:\n" + "1.Check First Name\n" + "2.Check Last Name\n"
                    + "3.Check EmailId\n" + "4.Exit\n");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Enter first name:");
                    regex.checkName(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Enter last name:");
                    regex.checkName(scanner.nextLine());
                    break;
                case 3:
                    System.out.println("Enter emailId:");
                    regex.checkEmailId(scanner.nextLine());
                    break;
                case 4:
                    check = false;
                    break;
                default:
                    System.out.println("Compile Again!");
            }
        }
    }

    private void checkEmailId(String email) {
        boolean variable = Pattern.matches("^[a-z]+[._+]?[a-z_0-9]*[@][a-z_0-9]+[.][a-z]{2,4}[.]?[a-z]*$",email.toLowerCase());
        if (variable) {
            System.out.println("Valid email -->" + email);
        } else {
            System.out.println("Invalid email -->" + email);
        }
    }

    private void checkName(String name) {
        boolean value = Pattern.matches("^[A-Z]{1}[a-zA-Z]{3,}$", name);
        if (value) {
            System.out.println("Valid Name : " + name);
        } else {
            System.out.println("Invalid Name: " + name);
        }
    }
}
