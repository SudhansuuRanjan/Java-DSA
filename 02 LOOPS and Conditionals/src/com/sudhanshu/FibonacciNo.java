package com.sudhanshu;

import java.util.Scanner;

public class FibonacciNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n for getting nth fibonacci term : ");
        int n = in.nextInt();
        int a = 0 , b = 1;
        int count = 2;

        while(count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
