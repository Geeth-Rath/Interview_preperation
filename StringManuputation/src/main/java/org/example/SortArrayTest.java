package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SortArrayTest {
    int arr [] = {2,5,7,8,9,2,3,5,5,1};

    public void sortArray(){
//        Arrays.stream(arr).sorted();
//        System.out.println();
        Set s = new HashSet();
        for (int ar:arr) {
            s.add(ar);
        }
        System.out.println(s);

    }


}
