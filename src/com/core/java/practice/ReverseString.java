package com.core.java.practice;

public class ReverseString {

    public static void main(String[] args) {

        String reverse ="";
        String name="my name is chetan";

        for(int i=name.length()-1;i>=0;i--){

            reverse=reverse +name.charAt(i);




        }
        System.out.println("Reverse String "+reverse);
    }
}
