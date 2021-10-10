package com.assignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Number to find factorial : ");
        int a  = in.nextInt();
        factorial(a);
    }

     static void factorial(int n) {
        int fact = 1;
        while(n>1){
            fact *=n;
            n--;
        }
         System.out.println("Factorial is : "+ fact);
    }
}
