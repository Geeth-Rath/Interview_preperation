package org.example;

public class Palignrom {
    public boolean getPalingrom(String s){ // abvcba
        int start = 0;
        int end = s.length()-1;
        
        while(start <= end){
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start ++;
            end --;
        }
        return true;


    }
}
