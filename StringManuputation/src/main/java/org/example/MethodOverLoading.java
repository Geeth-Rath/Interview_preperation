package org.example;

public class MethodOverLoading {
    // this is possible.
    // method name should be same. parameters should be changed ----> data type , para: count
    // both are satisfied

    public static void max(int a) {
        System.out.println("return void");
    }
    public static void max(int a, int b) {
        System.out.println("return void with two parems");
    }

//    int max(String b) {
//        return 50;
//    }
}
