package com.java.introduction.helloworld;
/**
 * VowelConsonant
 */
public class VowelConsonant {

    public void checkVowelConsonant() {
        char ch = 'i';

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
    }
}