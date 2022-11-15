package com.userregistration;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    ArrayList<String> list = new ArrayList<>();

    private static void validFirstName() {
        System.out.println("Welcome To User Registration");
        String firstName = "Pinky";
        boolean result = validName(firstName);
        System.out.println("\nFirst name :  " + firstName + " ==> " + result);
    }

    private static void validLastName() {
        String lastName = "Reddy";
        boolean result = validName(lastName);
        System.out.println("\nLast name: " + lastName + " ==> " + result);
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
        System.out.println("\nThe email is: " + email + " ==> " + result);

    }

    private static void validPhoneNumber() {
        boolean result = false;
        String phoneNumber = "+91 7995491772";
        String regex = "[+91]+() +[789][0-9]{9}";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < phoneNumber.length(); i++) {
            Matcher matcher = pattern.matcher(phoneNumber);
            result = matcher.matches();
        }
        System.out.println("\nThe phone number is: " + phoneNumber + " ==> " + result);
    }

    private static void validPassword() {
//        UC-5 to UC-8 All were in this method Only
        boolean result = false;
        String password = "pInKy@123";
        String regex = "(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < password.length(); i++) {
            Matcher matcher = pattern.matcher(password);
            result = matcher.matches();
        }
        System.out.println("\nThe password is: " + password + " ==> " + result);
    }


    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();
        user.validFirstName();
        user.validLastName();
        user.validEmail();
        user.validPhoneNumber();
        user.validPassword();
    }


}



