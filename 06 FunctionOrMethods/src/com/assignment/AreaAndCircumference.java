package com.assignment;

import java.util.Scanner;

public class AreaAndCircumference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius of circle : ");
        int radii = in.nextInt();
        System.out.println("Area is : "+ area(radii) + "Circumference is : "+ circumference(radii));
    }

    static double area(int a ){
        double area = 3.14 * a * a ;
        return area ;
    }
    static double circumference(int a ){
        double cir = 3.14 * 2 * a ;
        return cir ;
    }
}
