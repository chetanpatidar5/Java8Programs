package com.core.java.newjava;

import java.util.List;
import java.util.stream.Collectors;

public class FP02Example {
    public static void main(String[] args) {

        List<Integer> list=List.of(1,3,5,8,22,43,44);

        List<String> courses = List.of("Spring", "Microservices", "AWS", "Spring", "SpringBoot", "SpringBoot");

       List<Integer> doubleNumbers =squareList(list);

       System.out.println("double numbers"+doubleNumbers);

        List<Integer> courseList=coursesList(courses);
        System.out.println("courses  numbers"+courseList);

        }

        public static List<Integer>  squareList(List<Integer> list) {

            return list.stream().filter(number -> number % 2 == 1)
                    .map(number -> number * number).collect(Collectors.toList());
        }

        private static List<Integer> coursesList(List<String> coursesList){
        return coursesList.stream().map(x->x.length()).collect(Collectors.toList());
            }


}
