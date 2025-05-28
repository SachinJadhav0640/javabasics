package com.myjava.basics.methods;

import java.util.Scanner;

/*Assignment 3: Add Two Numbers with a Return Value
Problem: Write a method that takes two integers as parameters, adds them,
and returns the sum. Call the method from main and print the result.*/

public class AddNumbers {
    public static void main(String[] args) {
        Scanner m3 = new Scanner(System.in);
        System.out.println("Enter two integer numbers to calculate sum");
        int a = m3.nextInt();
        int b = m3.nextInt();
//        int a = 5;
//        int b = 6;
        int sum = calculateSum(a, b);
        System.out.println("Sum of " + a + " and " + b + " is: " +sum);
    }
    public static int calculateSum(int num1, int num2) {
        return (num1 + num2);
    }
}