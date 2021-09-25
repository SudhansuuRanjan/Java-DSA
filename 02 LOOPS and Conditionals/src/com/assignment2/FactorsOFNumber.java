package com.assignment2;

import java.util.Scanner;

public class FactorsOFNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 1;
        while(count <= n){
            if(n % count == 0){
                System.out.println(count);
            }
            count++;
        }
    }
}
