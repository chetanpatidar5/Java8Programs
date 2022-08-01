package com.core.java;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementsTest {
    public static void main(String[] args) {


        List<String> list = List.of("Spring", "Microservices", "AWS", "Spring", "SpringBoot", "SpringBoot");


     /*   Set<String> dupNum=new HashSet<>();

    list.stream().filter(e->!dupNum.add(e)).collect(Collectors.toSet()).forEach(System.out::println);
}}*/

        list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().forEach(entrySet->System.out.println(entrySet.getKey()+""+entrySet.getValue()));

    }}


