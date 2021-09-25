package com.sudhanshu;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int firstno = input.nextInt();
        System.out.println("Enter second number : ");
        int secondno = input.nextInt();

        int sum = firstno + secondno ;
        System.out.println("Sum is : " + sum);

    }
}
