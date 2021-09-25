package com.assignment2;

import java.util.Scanner;

public class SubtractProductAndSumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = in.nextInt();
        int sum = 0;
        int product = 1;
        int rem ;
        while(n > 0){
           rem = n % 10 ;
           product *= rem ;
           sum += rem;
           n = n/10;
        }
        System.out.println(product - sum);
    }
}
