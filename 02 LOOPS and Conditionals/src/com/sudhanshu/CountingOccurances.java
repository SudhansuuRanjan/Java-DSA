package com.sudhanshu;

import java.util.Scanner;

public class CountingOccurances {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int rem;
        int count = 0;
        while(n>0){
            rem = n % 10;
            n = n/10;
            if(rem == m){
                count++;
            }
        }
        System.out.println(count);

    }
}
