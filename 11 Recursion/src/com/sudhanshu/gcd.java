package com.sudhanshu;

public class gcd {
    public static void main(String[] args) {
        System.out.println(GCD(8, 42));
    }

    static int GCD(int x, int y) {
       if(y != 0){
           return GCD(y , y % x);
       }else{
           return x;
       }
    }
}
