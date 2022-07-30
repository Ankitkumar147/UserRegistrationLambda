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
        System.out.println(validateFirstName(firstName));
        System.out.println(validateLastName(lastName));
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
}