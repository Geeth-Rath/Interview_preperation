package org.example;

public class MinDistance {
    public void minDistanceInStrings(){
        String [] s = { "the", "quick", "brown", "fox", "quick" };
        String word1 = "the", word2 = "fox";
        int distance = 20;
        int s1=-1;
        int s2=-1;

        for (int i = 0; i <= s.length-1; i++) {
            if(word1.equals(s[i])){
                System.out.println(i);
                s1= i;
            }
            if (word2.equals(s[i])) {
                System.out.println(i);
                s2 = i;
            }
//            System.out.println(Math.abs(s1-s2));
            System.out.println("***");
//            System.out.println(distance);
            if (s1 !=-1 && s2 !=-1) {
                distance = Math.min(Math.abs(s1 - s2), distance);
            }
        }
        System.out.println(distance);
    }
}
