package org.example;

public class ReverseArray {
    // swap first and last

    public void reverseWord(String s){
        char c [] = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while(start < end){
            char temp;
            temp = c[start];
            c[start] = c[end];
            c[end] = temp;

            start++;
            end--;
        }
        System.out.println(c);
    }
}
