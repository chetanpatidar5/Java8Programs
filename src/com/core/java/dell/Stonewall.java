package com.core.java.dell;

import java.util.*;

public class Stonewall {
    public int solution(int[] H) {
        Stack<Integer> stack = new Stack<Integer>();
        int count = 0;
        for(int i = 0; i < H.length; i++){
            if(stack.size() == 0)
            {
                count++;
                stack.push(H[i]);
            }else{
                if(stack.peek() > H[i]){
                    while(stack.size() > 0 && stack.peek() > H[i]){
                        stack.pop();
                    }
                    i--;
                }else if(stack.peek() < H[i]){
                    count++;
                    stack.push(H[i]);
                }
            }
        }
        return count;
    }
}

