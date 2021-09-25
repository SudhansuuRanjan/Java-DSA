package com.intermediateassignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a no to find its factorial : ");
        int n = in.nextInt();
        int fact = n;
        while(n>1){
            fact *= n-1 ;
            n--;
        }
        System.out.println(fact);
    }
}
