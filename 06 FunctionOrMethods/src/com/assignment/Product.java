package com.assignment;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = in.nextInt();
        System.out.println("Enter second number : ");
        int num2 = in.nextInt();
        System.out.println("Product is : "+sum2(num1,num2));
    }

    static int sum2(int a , int b){
        int add = a * b;
        return add;
    }
}
