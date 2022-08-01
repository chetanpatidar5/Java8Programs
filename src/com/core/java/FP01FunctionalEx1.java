package com.core.java;

import java.util.List;

public class FP01FunctionalEx1 {
    public static void main(String[] args) {


        List<Integer> numbers = List.of(12, 9, 8, 6, 3, 2, 12, 11, 15, 4);
//printEvenNumbersInListFunctional(numbers);
        printCubesEvenNumbersInListFunctional(numbers);

List<String> courses=List.of("Spring","Microservices","AWS","Spring","SpringBoot","SpringBoot");


       // courses.stream().forEach(System.out::println);
        //courses.stream().filter(course->course.contains("Spring")).forEach(System.out::println);
       courses.stream().map(course->course+""+course.length()).forEach(System.out::println);
    }


public static void printEvenNumbersInListFunctional(List<Integer> numbers){

    numbers.stream().
            filter(number->number%2==1).forEach(System.out::println);


}
    public static void printCubesEvenNumbersInListFunctional(List<Integer> numbers){

        numbers.stream().
                filter(number->number%2==1)
                        .map(number ->number *number*number)
        .forEach(System.out::println);


    }


}
