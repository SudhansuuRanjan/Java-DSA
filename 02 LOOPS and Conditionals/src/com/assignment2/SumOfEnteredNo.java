package com.assignment2;

import java.util.Scanner;

public class SumOfEnteredNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0;
        while(true){
            int n = in.nextInt();
            if (n == 0){
                System.out.println(temp);
                break;
            }
            temp += n;
        }
    }
}
