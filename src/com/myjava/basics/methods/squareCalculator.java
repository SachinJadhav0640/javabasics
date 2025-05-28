package com.myjava.basics.methods;

import java.util.Scanner;

/*Practice Assignments for Methods
The Methods topic involves defining methods, using parameters, return types, and method overloading.
These assignments will help you understand how to create reusable code blocks and call them.

Assignment 1: Calculate Square of a Number
Problem: Write a method that takes an integer as input and returns its square. Call the method from main and
print the result.*/

public class squareCalculator {
    public static void main(String[] args) {
        Scanner m1 = new Scanner(System.in);
        System.out.println("Enter the number to check the Square");
        int number = m1.nextInt();
//        int number = 6;
        int square = calculateSquare(number);
        System.out.println("Square of " + number + " is : " + square);
    }

    public static int calculateSquare(int num) {
        return num * num;
    }
}