package com.intermediateassignment;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Units Consumed : ");
        int Units = in.nextInt();
        System.out.println("Enter rate per unit : ");
        int rate = in.nextInt();
        int bill = rate * Units ;
        System.out.println("Yor bill is : " + bill);
    }
}
