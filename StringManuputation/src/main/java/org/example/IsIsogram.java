package org.example;

import java.util.HashSet;
import java.util.Set;

public class IsIsogram {
//   each letter in the word should appear once
    public void isogram(String s){

        Set setmap = new HashSet();
//        for (char c: s.toCharArray()) {
//            setmap.add(c);
//        }
//        System.out.println("s length: "+ s.length());
//        System.out.println("setmap length: "+ setmap.size());
//        if( s.length() != setmap.size()) {
//            System.out.println("Word is not a isogram");
//        }
//        else {
//            System.out.println("Word is a isogram");
//        }
        int count = 0;
        while (count <= s.length()-1){
            if (setmap.contains(s.charAt(count)) ) {
                System.out.println("Word is not a isogram");
                return;

            }else {
                setmap.add(s.charAt(count));
            }
            count++;
        }
        System.out.println("Word is  a isogram");


    }
}
