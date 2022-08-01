package com.core.java;

import java.util.List;
import java.util.stream.Collectors;

public class FP01Functional {

    public static void main(String[] args) {
        printAllNumbersInList(List.of(1,3,5,8,22,43,44));

    }

    /*private static boolean evenNum(int numbers){
      return numbers%2==0;

    }*/

    private static void printAllNumbersInList(List<Integer> numbers) {

        /*for (int num:integers) {
            System.out.println(num);
        }*/
      //numbers.stream().filter(FP01Functional::evenNum).forEach(System.out::println);
numbers.stream().filter(number->number%2==0).forEach(System.out::println);
    }
}
