package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserValidation {
    public static void main(String[] args) {

        String firstNamePattern = "[A-Z]{1}[a-z]{2}";
        String lastNamePattern = "[A-Z]{1}[a-z]{2}";
        String emailPattern = "^[a-zA-Z0-9]{1,}[.a-zA-Z0-9]*@[a-zA-Z0-9]{1,}((.){1}+)([a-z]{1,3}+)(.[a-z]{2})*$";
        String phoneNoPattern = "^[0-9]{2}[\\s][0-9]{10}$";
        String passwordPattern = "^[A-Z]{1}[a-z]{3,10}[@,&,$,_]{1}[0-9]{1,10}";
        /**
         * below is lambda expression where i build my reapeted login will be happen in code
         */
        IValidation firstName = ((pattern, userInput) -> {
            boolean result = Pattern.matches(pattern, userInput);
            return result;
        });
        /**
         * @using lambda function we validate our code in less code
         * and match pattern
         */
            System.out.println("enter a name :");
            Scanner sc = new Scanner(System.in);
            String fName = sc.nextLine();
            if (firstName.Validate(firstNamePattern, fName)) {
                System.out.println("valid name");
            } else throw new RuntimeException("invalid name");

        /**
         * @using lambda function we validate last name our code in less code
         * and match pattern
         */
        System.out.println("enter your last name");
        String lName = sc.nextLine();
        if(firstName.Validate(lastNamePattern,lName)) {
            System.out.println("valid name");
        }
        else throw new RuntimeException("invalid last name");
        /**
         * @using lambda function we validate emai id our code in less code
         * and match pattern
         */
        System.out.println("enter your email id");
        String email = sc.nextLine();
        if(firstName.Validate(emailPattern,email)) {
            System.out.println("valid");
        }
        else throw  new RuntimeException("invalid email id");
        /**
         * @using lambda function we validate our phone no code in less code
         * and match pattern
         */
        System.out.println("enter your phone no");
        String contact = sc.nextLine();
        if(firstName.Validate(phoneNoPattern,contact)) {
            System.out.println("valid");
        }
        else throw  new RuntimeException("invalid phone no ");
        /**
         * @using lambda function we validate password our code in less code
         * and match pattern
         */
        System.out.println("enter your password");
        String password = sc.nextLine();
        if(firstName.Validate(passwordPattern,password)) {
            System.out.println("valid");
        }
        else throw  new RuntimeException("password ");

        System.out.println("**thanks for joining us** ");
    }
}
