package com.userregistration;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static void validFirstName() {
        System.out.println("Welcome To User Registration");
        String firstName = "Pinky";
        boolean result = validName(firstName);
        System.out.println("First name :  " + firstName + " ==> " + result);
    }

    private static void validLastName() {
//        System.out.println("Welcome To User Registration");
        String lastName = "Reddy";
        boolean result = validName(lastName);
        System.out.println("Last name: " + lastName + " ==> " + result);
    }

    private static boolean validName(String name) {
        boolean result = false;
        String regex = "[A-Z]{1}[a-z]{3,}";// {3,} means above 3
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < name.length(); i++) {
            Matcher matcher = pattern.matcher(name);
            result = matcher.matches();
        }

        return result;
    }

    private static void validEmail() {
        boolean result = false;
        String email = "pinky_123@gmail.com";
        String regex = "^[a-z0-9+_.-]+@+[a-z]+.+[a-z]";// {3,} means above 3
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < email.length(); i++) {
            Matcher matcher = pattern.matcher(email);
            result = matcher.matches();
        }
        System.out.println("The email is: " + email + " ==> " + result);

    }

    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();
        user.validFirstName();
        user.validLastName();
        user.validEmail();
    }


}



