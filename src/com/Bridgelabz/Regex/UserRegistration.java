package com.Bridgelabz.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {

    public static void main(String[] args) {
        System.out.println("Enter your First Name.");
        Scanner sc1 = new Scanner(System.in);
        String firstName = sc1.next();
        System.out.println(validateFirstName(firstName));
    }
    private static boolean validateFirstName(String firstName){
        Pattern pattern = Pattern.compile("[A-Z]{1}+[a-z]{2,2}");
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }
}
