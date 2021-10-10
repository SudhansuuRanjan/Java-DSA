package com.sudhanshu;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = in.nextInt();
        System.out.println("Enter Second Number : ");
        int b = in.nextInt();

        swap(a,b);
        System.out.println("Now value of a :"+a+" and value of b : "+ b);
    }
    static void swap(int a , int b){
        int temp;
        temp = a;
        a = b;
        b = temp ;
    }
}
