package org.example;

public class Lseg {
    public void letterCount(String s){
        int count = 1;
        char c []= s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < c.length-2; i++) {
            if(c[i]==c[i+1] ){
                count++;
                System.out.println("ffffffff :" + c[i]);

            }
            if(c[i] !=c[i+1]) {
//                System.out.println(count);
                sb.append(c[i]).append(count);
                count = 1;
            }


        }
        sb.append(c[sb.length()-1]).append(count);
        System.out.println(sb.toString());
    }
}
