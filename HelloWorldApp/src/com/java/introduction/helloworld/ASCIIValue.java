package com.java.introduction.helloworld;
/**
 * ASCIIValue
 */
public class ASCIIValue {

    public void printAsciiValue(){
        char ch = 'a';

        int ascii = ch;

        int castAscii = (int) ch;

        System.out.println("Ascii value == " + ascii);

        System.out.println("Cast ascii value == " + castAscii);
    }
}