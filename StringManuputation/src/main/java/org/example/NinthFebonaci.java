package org.example;
// 0 1 2 3 4 5 6 7  8  9
// 0 1 1 2 3 5 8 13 21 34
public class NinthFebonaci {
    public int getFeboVal(int n){
        if(n==1){
            return 1;
        } else if (n == 0) {
            return 0;
        } else{
            return getFeboVal(n-1) + getFeboVal(n-2);
        }
    }
}
