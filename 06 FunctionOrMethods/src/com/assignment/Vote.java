package com.assignment;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = in.nextInt();
        if(isEligible(age)){
            System.out.println("You are eligible to vote.");
        }
        else{
            System.out.println("You are not  eligible to vote.");
        }
    }

     static boolean isEligible(int age) {
        if ( age >= 18){
            return true;
        }
        return false;
    }
}
