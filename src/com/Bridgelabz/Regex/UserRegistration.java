package com.Bridgelabz.Regex;

import javax.xml.bind.ValidationException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface checker {

}

public class UserRegistration {


    public static void main(String[] args) {
        System.out.println("Welcome to the User Registration Program.");
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
        System.out.println("\n User Details----------------------");
        System.out.print("\n Full Name :- "+firstName + " ");
        System.out.print(lastName+",");
        System.out.print("\n Email :- "+email+",");
        System.out.print("\n Phone NUmber :- "+phoneNumber+",");
        System.out.print("\n Password :- "+password+"\n");
        System.out.println("---------------End------------------");
    }

    private static boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile("[?A-Z][a-z]{2,}");
        if ( firstName == null){
            return false;
        }
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches())
            return true;
        else
            try{
                throw new ValidationException("Invalid Name");
            } catch (ValidationException e){
                e.printStackTrace();
            }
        return matcher.matches();
    }

   private static boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile("[?A-Z]+[a-z]{2,}");
       if ( lastName == null){
           return false;
       }
       Matcher matcher = pattern.matcher(lastName);
       if (matcher.matches())
           return true;
       else
           try{
               throw new ValidationException("Invalid Name");
           } catch (ValidationException e){
               e.printStackTrace();
           }
        return matcher.matches();
    }

    private static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z]+[.][a-zA-Z]+@+[a-zA-Z]+[.][a-zA-Z][*.][*a-zA-Z]$");
        if ( email == null){
            return false;
        }
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches())
            return true;
        else
            try{
                throw new ValidationException("Invalid Name");
            } catch (ValidationException e){
                e.printStackTrace();
            }
        return matcher.matches();
    }

    private static boolean validatePhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile("[0-9]{2}+[-]+[0-9]{10}");
        if ( phoneNumber == null){
            return false;
        }
        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.matches())
            return true;
        else
            try{
                throw new ValidationException("Invalid Name");
            } catch (ValidationException e){
                e.printStackTrace();
            }
        return matcher.matches();
    }

    private static boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$");
        if ( password == null){
            return false;
        }
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches())
            return true;
        else
            try{
                throw new ValidationException("Invalid Name");
            } catch (ValidationException e){
                e.printStackTrace();
            }
        return matcher.matches();
    }
}