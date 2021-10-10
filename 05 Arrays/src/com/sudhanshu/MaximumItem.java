package com.sudhanshu;

import java.util.Scanner;

public class MaximumItem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int[] arr = new int[m];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element is : "+ max);
    }
}
