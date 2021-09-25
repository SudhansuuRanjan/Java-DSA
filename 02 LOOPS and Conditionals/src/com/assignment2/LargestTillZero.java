package com.assignment2;

import java.util.Scanner;

public class LargestTillZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 0;
        while(true){
            int n = in.nextInt();
            if(max < n){
                max = n;
            }
            if (n == 0){
                System.out.println(max);
                break;
            }

        }
    }
}
