package com.core.java;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Test2 {



            public static void main(String[] args) {

        // Get the stream
        Stream<String> stream = Stream.of("KYC", "For",
                "Kyc", "A",
                "Computer", "Portal");

        // Since the stream is not being consumed
        // this will not throw any exception

        // Print the stream
        stream.filter(s -> s.startsWith("K"))
                .peek(s -> System.out.println("Filtered value: " + s))
                .map(String::toUpperCase)
                .peek(s -> System.out.println("Uppercase value :" + s))
                .count();


    }
        }




