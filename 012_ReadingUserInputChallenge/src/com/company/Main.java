package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Read 10 numbers from console entered by user
//        Print sum of those numbers
//        Create scanner
//        use hasNextInt()
//        error message: "Invalid Number"
//        Continue reading until you have 10 numbers
//        use nextInt() method to ge the number and add it to the sum
//        b/f user enters each number print "Enter number #x:" where x represents the count
//        Enter number #2, Enter number #3.
//        Hint: while loop
//        counter vairable for counting valid numbers
//        close scanner after you don't need int

//        Create New Instance of Scanner
        Scanner scanner = new Scanner(System.in);

//        Incremented Prompt Number
        int promptNumber = 1;

//        Sum of User Entered Integers
        int sum = 0;

        while (promptNumber != (10 + 1)) {
//            Prompt Message w/ Sequentially Labelled Requests
            System.out.println("Enter number #" + promptNumber + ":");

//        Type Checking & Error Handling
            boolean validNumber = scanner.hasNextInt();
            if (validNumber) {
//                Increment 'listNumber' on Valid Input
                promptNumber++;

//                Add integer to sum
                sum += scanner.nextInt();
            } else {
                System.out.println("Invalid Number");
//                continue;
            }
            scanner.nextLine();
        }
        System.out.println(sum);

//        Close Scanner
        scanner.close();
    }
}
