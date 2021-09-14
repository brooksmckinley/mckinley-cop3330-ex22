/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = scan.nextInt();
        System.out.print("Enter the second number: ");
        int second = scan.nextInt();
        System.out.print("Enter the third number: ");
        int third = scan.nextInt();

        // Exit if all are the same
        if (first == second && second == third) return;

        System.out.println(getLargestReport(first, second, third));
    }

    public static String getLargestReport(int first, int second, int third) {
        int largest = first;
        if (second > largest) {
            largest = second;
        }
        if (third > largest) {
            largest = third;
        }

        return "The largest number is " + largest + ".";
    }
}