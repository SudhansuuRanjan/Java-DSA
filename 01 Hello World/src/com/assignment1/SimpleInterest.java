package com.assignment1;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principle : ");
        int p = input.nextInt();
        System.out.println("Enter Time duration in years : ");
        int t = input.nextInt();
        System.out.println("Enter percentage rate of interest : ");
        float r = input.nextFloat();

        float si = (p * r * t) / 100 ;
        float total = p + si ;

        System.out.println("Simple interest is : "+ si);
        System.out.println("Total amount is : "+ total);


    }
}
