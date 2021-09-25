package com.intermediateassignment;

import java.util.Scanner;

public class DistanceBetPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Coordinates of first point : ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.println("Enter Coordinates of second point : ");
        int x2 = in.nextInt();
        int y2 = in.nextInt();

        double Dist = Math.sqrt( (x1-x2)*(x1-x2) + (y1 - y2)*(y1-y2));
        System.out.println(Dist);
    }
}
