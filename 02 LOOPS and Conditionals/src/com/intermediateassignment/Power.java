package com.intermediateassignment;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = in.nextInt();
        System.out.println("Enter the power : ");
        int p = in.nextInt();
        int temp = 1;
        for (int i = 0; i < p; i++) {
            temp *= n ;
        }
        System.out.println(temp);
    }
}
