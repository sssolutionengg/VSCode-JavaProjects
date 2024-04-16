package com.java.introduction.helloworld;
public class SumNaturalNumbers {

    void sumNumbers(){
        int sum = 0, num = 100;

        for(int i=1; i <= num; ++i){
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}
