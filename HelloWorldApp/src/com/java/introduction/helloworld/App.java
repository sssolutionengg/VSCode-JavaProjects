package com.java.introduction.helloworld;
public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Print integer adter reading it from consile
        // PrintInteger printInteger = new PrintInteger();
        //printInteger.readConsoleInput();

        //add two integers
        AddTwoIntegers twoInt = new AddTwoIntegers();

        twoInt.addInt();

        //print sum of two natural number
        SumNaturalNumbers sumNatural = new SumNaturalNumbers();
        sumNatural.sumNumbers();

        //product of 2 floating point numbers
        MultiplyTwoFloatNumbers mtn = new MultiplyTwoFloatNumbers();
        mtn.multiplyFloat();

        //print ascii value
        ASCIIValue ascii = new ASCIIValue();
        ascii.printAsciiValue();

        // Swap two numbers
        SwapNumbers swap = new SwapNumbers();
        swap.swapNum();

        // Even odd number check
        // EvenOdd num = new EvenOdd();
        // num.checkEvenOdd();

        // check if it's vowel & consonant
        VowelConsonant vowcons = new VowelConsonant();
        vowcons.checkVowelConsonant();
    }
}

