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
                    + "3.Check EmailID\n" + "4.Check Mobile Format\n" + "5.Check Password\n"
                    + "6.Exit\n");
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
                    System.out.println("Enter mobile number with country code:");
                    regex.checkMobileNumber(scanner.nextLine());
                    break;
                case 5:
                    System.out.println("Enter password:");
                    regex.checkPassword(scanner.nextLine());
                    break;
                case 6:
                    check = false;
                    break;
                default:
                    System.out.println("Compile Again!");
            }
        }
    }

    private void checkPassword(String password) {
        boolean value = Pattern.matches("^[0-9_A-Z]{8,}$", password);
        String checkCondition = value?"Valid Password : " + password:"Invalid Password: " + password;
        System.out.println(checkCondition);
    }


    private void checkMobileNumber(String mobileNumber) {
        boolean value = Pattern.matches("^(91)\\s?[6-9][0-9]{9}$", mobileNumber);
        if (value) {
            System.out.println("Valid Number : " + mobileNumber);
        } else {
            System.out.println("Invalid Number: " + mobileNumber);
        }
    }

    private void checkEmailId(String email) {
        boolean variable = Pattern.matches("^[a-z]+[._+]?[a-z_0-9]*[@][a-z_0-9]+[.][a-z]{2,4}[.]?[a-z]*$", email.toLowerCase());
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
