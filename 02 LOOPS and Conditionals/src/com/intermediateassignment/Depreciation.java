package com.intermediateassignment;

import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter current value : ");
        int c = in.nextInt();
        System.out.println("Enter percentage depreciation per year : ");
        int p = in.nextInt();
        System.out.println("Enter enter time duration in years  : ");
        int t = in.nextInt();

        int d = (c * p * t) /100 ;
        int current = c - d;
        System.out.println("amount depreciated : "+ d);
        System.out.println("Final value after depreciation : "+ current);

    }
}
