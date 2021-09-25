package com.intermediateassignment;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter actual Price : ");
        int P = in.nextInt();
        System.out.println("Enter discount in percent : ");
        int d = in.nextInt();
        int discount = (P * d)/100;
         P = P - discount;
        System.out.println("Discount is : " + discount );
        System.out.println("Yor bill is : " + P );
    }
}
