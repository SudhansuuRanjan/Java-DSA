package com.assignment2;

import java.util.Scanner;

public class FibonaciiSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int temp ;
        if(n == 1){
            System.out.println(a);
        }
        else {
            System.out.println(a);
            while (n-1 > 0) {
                temp = b;
                b = b + a;
                a = temp;
                System.out.println(temp);
                n--;
            }
        }
    }
}
