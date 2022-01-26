package com.regex.userregistration;

import java.util.regex.Pattern;

public class CheckEmails {


    public static void main(String[] args) {
        CheckEmails checkEmails = new CheckEmails();
        String[] arrayOfValidEmails = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc-100@yahoo.com",
                                        "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", "abc+100@gmail.com",
                                        "abc111@abc.com", "abc.100@abc.com.au", "abc@1.com", "bc@gmail.com.com"};

        String[] arrayOfInValidEmails ={"abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",
                                        ".abc@abc.com","abc()*@gmail.com","abc@%*.com","abc..2002@gmail.com",
                                        "abc.@gmail.com","abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au"};

        checkEmails.checkEmailId(arrayOfValidEmails);
        checkEmails.checkEmailId(arrayOfInValidEmails);
    }

    private void checkEmailId(String[] arrayOfEmail) {
        for (int i = 0; i < arrayOfEmail.length; i++) {
            boolean variable = Pattern.matches("^[a-z]+[._+-]?[a-z_0-9]*[@][a-z_0-9]+[.][a-z]{2,4}[.]?([a-z]{2,4})*$", arrayOfEmail[i]);
            if (variable) {
                System.out.println("Valid email-->" + arrayOfEmail[i]);
            } else {
                System.out.println("Invalid email-->" + arrayOfEmail[i]);
            }
        }
    }
}
