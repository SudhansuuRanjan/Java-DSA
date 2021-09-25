package com.assignment1;
import java.util.Scanner;

public class Oddoreven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is even or odd : ");
        int n = input.nextInt();
        if(n == 0){
            System.out.println("Number is zero");
        }
        else if(n % 2 == 0){
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }
}
