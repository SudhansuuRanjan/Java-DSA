package com.assignment;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = in.nextInt();
        System.out.println(isPalindrome(a));
    }

    static boolean isPalindrome(int a) {
        int num = a ;
        int rem = 0;
        int temp = 0;
        while(a > 0){
            rem = a % 10 ;
            System.out.println(rem);
            temp = temp * 10 + rem ;
            a = a / 10 ;
        }
        if ( num == temp){
            return true;
        }
        return false;
    }
}
