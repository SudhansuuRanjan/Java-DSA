package com.intermediateassignment;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Total runs scored by player : ");
        int r = in.nextInt();
        System.out.println("Number of times the player got out : ");
        int n = in.nextInt();
        int bavg = r / n ;
        System.out.println("Batting Average : " + bavg);
    }
}
