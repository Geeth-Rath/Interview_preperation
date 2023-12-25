package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CommonPrifix {
    public void commonLongestPrefix(){
        String[] input = {"geeksforgeeks", "geeks", "geek", "geezer"};
        String s = "";
        StringBuilder sb = new StringBuilder();

        Arrays.sort(input);
//        for(String i : input){
//            System.out.println(i);
//        }
//        System.out.println(input[0]);

        int min = Math.min(input[0].length(), input[input.length-1].length());
        for (int i = 0; i < min; i++) {
                if (input[0].charAt(i) == input[input.length-1].charAt(i)){
//                        s= input[0].substring(0,i);
                        sb.append(input[0].charAt(i));
                }
        }
        System.out.println(sb.toString());
    }
}
