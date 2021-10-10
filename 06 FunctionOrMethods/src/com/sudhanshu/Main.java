package com.sudhanshu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = in.nextInt();
        System.out.println("Enter second number : ");
        int num2 = in.nextInt();

        int sum = num1 + num2 ;
        System.out.println("Sum is : "+ sum);


    }
}
