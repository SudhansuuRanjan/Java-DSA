package com.assignment2;

import java.util.Scanner;

public class AreaOfRect {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int breadth = in.nextInt();

        double area = (0.5 * length  * breadth) ;

        System.out.println("Area of Rectangle : " + area);

    }
}
