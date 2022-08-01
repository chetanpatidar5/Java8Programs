package com.core.java;

import java.util.List;

public class FP01Structured {

    public static void main(String[] args) {

        List<Integer> numbers=List.of(1,3,5,8,22,43);
       // printAllNumbersInList(numbers);
        printEvenNumbers(numbers);
        
    }

    private static void printEvenNumbers(List<Integer> numbers){
        for (int num:numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }

        }

    }

    private static void printAllNumbersInList(List<Integer> integers) {

        for (int num:integers) {
          System.out.println(num);
        }
    }
}
