package com.core.java.dell;
import java.util.*;

public class Test4 {


    static int solutions(String[] input) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int index = 0;
        for(String s : input) {
            List<Integer> list = new ArrayList<>();

            for (int i =0; i < s.length(); i ++) {
                int k = Integer.parseInt(String.valueOf(s.charAt(i)));
                list.add(k);
            }
            map.put(index, list);
            ++index;
        }

        Map<Integer, Long> counts = new HashMap<>();
        for(List<Integer> inputEntry : map.values()) {
            for(Integer n: inputEntry) {
                Long c = counts.get(n);
                if (c == null) {
                    c =0L;
                }
                counts.put(n, c+1);
            }
        }
        Iterator<Long> it = counts.values().iterator();
        while (it.hasNext()) {
            Long c = it.next();
            if (c == 1L) {
                it.remove();
            }
        }
        //int mCount = 0;
        Map<String, Integer> map1 = new HashMap<>();
        Set<Integer> set = counts.keySet();
        for (String s: input) {
            for (int a : set) {
                if (s.contains(a+"")) {
                    map1.put(s, a);
                }
            }
        }
        return (int) map1.entrySet().stream().count();
    }



}
