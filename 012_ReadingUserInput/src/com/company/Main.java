package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Create new instance of Scanner
        Scanner scanner = new Scanner(System.in);

//        Display First Request
        System.out.println("Please enter your year of birth: ");

//        Validate Type
        boolean isInt = scanner.hasNextInt();

        if (!isInt) {
            System.out.println("Oops! You've entered something other than a number.");
        } else {
//
//        Store Interger Entered
            int yearOfBirth = scanner.nextInt();

//        Calculate Age from yearOfBirth
            int age = 2018 - yearOfBirth;

//        Without this, 'name' is set to 'enter'
            scanner.nextLine(); // handle next line character (enter key)

//        Display Second Request
            System.out.println("Enter your name: ");

//        Store String Entered
            String name = scanner.nextLine();

//        Prevent User from Being Bombarded with Error messages
            boolean validYear = true;

//        Display Any Errors:

//        Handle Negative Numbers
            if ((0 - yearOfBirth) > 0) {
                validYear = false;
                System.out.println("I'm sorry, but it looks like you might have entered a negative value for your year of birth. ");
            }

//        Check Age Range
            if (validYear && ((age < 0) || (age > 140))) {
                validYear = false;
                System.out.println("It looks like you might have entered an invalid value for your year of birth. " +
                        "You said you were born in " + yearOfBirth + ". Is that correct?");
            }

//        Display User's Name & Age
            if (validYear) {
                System.out.println("Your name is " + name + " and you are " + age + " years old.");
            }
        }

//        Close Scanner to Recollect Memory & Avoid Errors
        scanner.close();

	// write your code here
    }
}
