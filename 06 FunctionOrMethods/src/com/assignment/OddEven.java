package com.assignment;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a  number to find out if it is even or odd : ");
        int a = in.nextInt();
        oddeven(a);
    }

    static void oddeven(int a){
        if ( a == 0){
            System.out.println("Number is zero");
        }
        else if ( a % 2 == 0){
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }
}
