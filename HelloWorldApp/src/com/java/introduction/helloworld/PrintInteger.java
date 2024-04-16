package com.java.introduction.helloworld;
import java.util.Scanner;

/**
 * PrintInteger
 */
public class PrintInteger {

    public void readConsoleInput(){
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        System.out.println("You entered: " + number);
    }

}