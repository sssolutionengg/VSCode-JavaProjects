package com.java.introduction.helloworld;
import java.util.Scanner;

public class EvenOdd {
    
    public void checkEvenOdd() {

        Scanner scanValue = new Scanner(System.in);
        int input = scanValue.nextInt();

        if (input % 2 == 0) {
            System.out.println("Is an EVEN number; ");
        } else {
            System.out.println("Is an ODD number; ");
        }
    }
}
