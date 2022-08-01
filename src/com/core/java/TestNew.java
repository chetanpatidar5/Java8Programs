package com.core.java;

import com.core.java.dell.Main;

public class TestNew {

    public static void main(String[] args) {


        for (int N = 1; N <= 100; N++) {
            int div;
            if (N % 15 == 0) {
                System.out.println(N+"->"+"FizzBuzz");
            }
            if (N % 3 == 0) {
                System.out.println(N+"->"+"Fizz");
            } else if (N % 5 == 0) {
                System.out.println(N+"->"+"Buzz");
        }else{
                System.out.println(N+"->"+N);

            }
/*
    Please write a program that for each number from a series N=1...100 will output a series according to the following rules:
            - for any number divisible by 3, output "Fizz"
            - for any number divisible by 5, output "Buzz"
            - for any number divisible by 15, output "FizzBuzz"
            - by default output the number itself, (eg. n=4 -> 4)
            /*
 */
    }}}
