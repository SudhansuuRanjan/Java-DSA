package com.sudhanshu;

public class factorial {
    public static void main(String[] args) {
        System.out.println(Factorial(4));
    }

    static long Factorial(long n) {
        if( n == 1){
            return n;
        }
        return n * Factorial(n-1);
    }
}
