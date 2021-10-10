package com.assignment;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers to check pythagorean triplet : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(pyTriplet(a,b,c));
    }
    static boolean pyTriplet(int a , int b , int c){
        return a * a + b * b == c * c || c * c + b * b == a * a || a * a + c * c == b * b;
    }
}
