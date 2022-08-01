package com.core.java;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestLimit {

    public static void main(String[] args) {
        List<Integer> num=List.of(1,2,3,4,5,6,7,8,8,6,1,2);

       // num.stream().skip(5).forEach(System.out::println);
        Set<Integer> dupNum=new HashSet<>();


      // num.stream().filter(e->!dupNum.add(e)).collect(Collectors.toSet()).forEach(System.out::println);

     //   num.stream().filter(Collectors.groupingBy(), Collections.frequency()).

       // num.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);

        //    num.stream().filter(e->!dupNum.add(e)).collect(Collectors.toSet())
               // .forEach(System.out::println);


num.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().forEach(entrySet->System.out.println(entrySet.getKey()+"---"+entrySet.getValue()));




    }

}
