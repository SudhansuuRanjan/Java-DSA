package com.assignment;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Marks : ");
        int marks = in.nextInt();
        grade(marks);
    }

    static void grade(int marks) {
        System.out.println("Your Grade : ");
        if(marks >90 && marks <=100 ){
            System.out.println("AA");
        }
        else if(marks >80){
            System.out.println("AB");
        }
        else if(marks >70){
            System.out.println("BB");
        }
        else if(marks >60){
            System.out.println("BC");
        }
        else if(marks >50){
            System.out.println("CD");
        }
        else if(marks >40){
            System.out.println("DD");
        }
        else{
            System.out.println("Fail");
        }
    }
}
