package com.Bridgelabz.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {

    public static void main(String[] args) {
        System.out.println("Enter your First Name.");
        Scanner sc1 = new Scanner(System.in);
        String firstName = sc1.next();
        System.out.println("Enter your Last Name.");
        String lastName = sc1.next();
        System.out.println("Enter your E-mail ID in the format of i.e abc.xyz@bl.co.in.");
        String email = sc1.next();
        System.out.println("Enter your Mobile Number. Starting with 2 digit country code and then 10 digit number.");
        String phoneNumber = sc1.next();
        System.out.println("Enter the password Minimum 8 Characters.");
        String password = sc1.next();
        System.out.println(validateFirstName(firstName));
        System.out.println(validateLastName(lastName));
        System.out.println(validateEmail(email));
        System.out.println(validatePhoneNumber(phoneNumber));
        System.out.println(validatePassword(password));
        System.out.print(firstName + " ");
        System.out.print(lastName+",");
        System.out.print(email+",");
        System.out.print(phoneNumber+",");
        System.out.print(password+".");
    }

    private static boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile("[A-Z]{1}+[a-z]{2,}");
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    private static boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile("[A-Z]{1}+[a-z]{2,}");
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    private static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z]+[.][a-zA-Z]+@+[a-zA-Z]+[.][a-zA-Z]+[.][a-zA-Z]*$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private static boolean validatePhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile("[0-9]{2}+[-]+[0-9]{10}");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    private static boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]{8,}");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}