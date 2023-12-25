package org.example;

public class DivisibleBySeven {
    public String dividByseven(int y){ // 371
        // 37 – (2×1)
        if(  y == 7){
//            System.out.println(y);
            return  "yes";
        }
        else if( y <10 && y != 7){
//            System.out.println(y);
            return  "No";
        }
        else{
            int a = y % 10;
            int b = y /10;
            y = b - 2*a;
            System.out.println(y);
            return  dividByseven(Math.abs(y));
        }
//        return null;

    }
}
