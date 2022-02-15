package com.sudhanshu;

public class fibonacii {
    public static void main(String[] args) {
        System.out.println(fibonacii(40));;
    }

    static long fibonacii(long n){
        if(n < 2){
            return n;
        }
        return fibonacii(n-1) + fibonacii(n-2);
    }
}
//1 1 2 3 5 8 13