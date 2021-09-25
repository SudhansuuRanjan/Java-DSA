package com.assignment1;

import java.util.Scanner;

public class CurrencyConv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount in rupees : ");
        int a = input.nextInt();
        double usd = a / 75.4 ;

        System.out.println("The amount in USD is $" + usd);

    }
}
