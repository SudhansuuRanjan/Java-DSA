package com.intermediateassignment;

import java.util.Scanner;

public class AverageOfN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number upto which you want average : ");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum +=i;
        }
        int avg = sum/n;
        System.out.println(avg);
    }
}
