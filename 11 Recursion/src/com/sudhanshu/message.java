package com.sudhanshu;

public class message {
    private static int sum = 0;

    public static void main(String[] args) {
        //write a function that takes a number and print it
        //print first five numbers
        printNaturalNumbers(1);

    }

    static void printNaturalNumbers(int n){
        System.out.println(n);
        if( n == 5){
            return;
        }else{
            printNaturalNumbers(n+1);
        }
    }


}
