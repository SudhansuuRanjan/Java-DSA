package com.assignment1;

import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int n1 = input.nextInt();
        System.out.println("Enter first number : ");
        int n2 = input.nextInt();
        if(n1>n2){
            System.out.println("First number is greatest");
        }
        else if(n1<n2){
            System.out.println("Second number is greatest");
        }
        else{
            System.out.println("Both are equal!!");
        }

    }
}
