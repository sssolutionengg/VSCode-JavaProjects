package com.java.introduction.helloworld;
/**
 * MultiplyTwoFloatNumbers
 */
public class MultiplyTwoFloatNumbers {

    //Notice, we have used f after the numbers. 
    //This ensures the numbers are float, otherwise they will be assigned - type double.
    public void multiplyFloat(){
        float f1 = 10.0f;
        float f2 = 20.9f;

        float product = f1 * f2;

        System.out.println("Product of two floating point numbers :: " + product);
    }
}