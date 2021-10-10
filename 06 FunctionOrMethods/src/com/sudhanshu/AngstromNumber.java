package com.sudhanshu;

import java.util.Scanner;

public class AngstromNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check if it is angstrom number : ");
        int n = in.nextInt();
        for (int i = 100; i < 100; i++) {
            if (isAngstrom(n)) {
                System.out.println(i + "    ");
            }
        }

    }

    static boolean isAngstrom(int n) {
        int num = n;
        int rem = 0 , cube = 0;
        while(n > 0){
            rem = n % 10 ;
            n = n/10 ;
            cube +=  rem * rem * rem ;
        }
        if( num == cube ){
           return  true;
        }
        return  false;
    }
}
