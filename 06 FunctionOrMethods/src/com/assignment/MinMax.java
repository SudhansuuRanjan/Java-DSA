package com.assignment;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers to find max and min:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        MaxMin(a,b,c);
        maxmin(a,b,c);
    }
    static void MaxMin(int a , int b, int c){
        int max=a,min = a;
        if( b > max ){
            max = b;
        }
        else {
            min = b;
        }
        if( c > max ){
            max = c;
        }
        else{
           min = c;
        }
        System.out.println("Method : 1");
        System.out.println("Max is : "+ max + "  Min is : "+ min);
    }
    static void maxmin(int a , int b, int c){
        int max , min ;
        if(a > b && a > c){
            max = a;
        }
        else if(b > c && b > c){
            max = b;
        }
        else{
            max = c;
        }

        if(a < b && a < c){
            min = a;
        }
        else if(b < c && b < c){
            min = b;
        }
        else{
            min = c;
        }

        System.out.println("Method : 2");
        System.out.println("Max is : "+ max + "  Min is : "+ min);
    }
}
