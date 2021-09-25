package com.sudhanshu;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rev = 0;
        int rem;
        while(n > 0){
            rem = n % 10;
            n = n/10;
            rev = rev * 10 + rem;
        }
        System.out.println(rev);
    }
}
