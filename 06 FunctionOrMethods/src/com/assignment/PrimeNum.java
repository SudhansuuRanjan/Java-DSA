package com.assignment;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(prime(a));
    }
    static boolean prime( int a){
        if( a <= 1){
            return  false;
        }
        for(int i = 2 ; i< a/2 ; i++){
            if ( a % i == 0){
                return false;
            }
        }
        return true ;
    }
}
