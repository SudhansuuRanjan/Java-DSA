package com.assignment2;

import java.util.Scanner;

public class AreaOfTriangle {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int base = in.nextInt();
            int height = in.nextInt();

            double area = (0.5 * base  * height) ;

            System.out.println("Area of Triangle : " + area);

        }
    }
