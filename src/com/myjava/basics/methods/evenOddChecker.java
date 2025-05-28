package com.myjava.basics.methods;

public class evenOddChecker {
    public static void main(String[] args) {
        int number = -4;
        boolean isEven = isEven(number);
        System.out.println(number + " is " + (isEven ? "even" : "odd"));
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}