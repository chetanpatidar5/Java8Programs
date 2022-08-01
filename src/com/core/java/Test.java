package com.core.java;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {


       /* Set<Integer> numbers = new HashSet<Integer>();
        numbers.add(3);
        numbers.add(6);
        numbers.add(2);
        numbers.add(1);
        numbers.add(-4);
//numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
numbers.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);*/

        HashMap<Integer, String> hm=new HashMap<Integer, String>();
//addding keys and values to HashMap
        hm.put(23, "Yash");
        hm.put(17, "Arun");
        hm.put(15, "Swarit");
        hm.put(9, "Neelesh");
        Iterator it=hm.keySet().iterator();

        System.out.println("Before Sorting");
        while(it.hasNext())
        {
            int key=(int)it.next();
            System.out.println("Roll no:  "+key+"     name:   "+hm.get(key));
        }
        TreeMap<Integer,String >tm=new TreeMap<>(hm);
        Iterator itr=tm.keySet().iterator();
        while (itr.hasNext()){

            List<String> friends = Arrays.asList("Ross", "Chandler", "CSS",
                    "Monica", "Joey", "Rachel");

            friends.stream().map(name -> name.toUpperCase())
                    .forEach(name -> System.out.print(name + " "));

        }




    }


}


