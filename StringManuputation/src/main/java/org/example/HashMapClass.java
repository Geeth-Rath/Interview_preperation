package org.example;

import java.util.HashMap;

public class HashMapClass {

    final int x = 111111110;
    public void createMapstore(){

        final  int x = 454;
        HashMap<Integer , String> map= new HashMap<Integer, String>();
        map.put(1, "Amal");
        map.put(2,"Saman");
        map.put(3, "Kamal");
        System.out.println(map);
    }

    public void getMaxVal(){
        int [] arry = {99,106,55,7,77,35};
        int max = arry[0];
        int i = 0;
        while (i <= arry.length-1){
            System.out.println("max: "+ arry[i]);
            if(max < arry[i]){
                max = arry[i];
//                System.out.println("max: "+ max);
            }
            i++;
//
        }
        System.out.println(max);

        }
    }

