package com.assignment2;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int radii = in.nextInt();

        double area = (3.14 * radii * radii) ;

        System.out.println("Area of Circle : " + area);

    }
}
