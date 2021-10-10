package com.sudhanshu;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1 , 2 , 3 , 4 , 5 };
        System.out.println("Before Swap : ");
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println("After Reverse : ");
        System.out.println(Arrays.toString(arr));
        swap(arr,1,3);
        System.out.println("After Swap : ");
        System.out.println(Arrays.toString(arr));

    }

    static void reverse(int[] arr) {
        for (int i = 0; i < arr.length/2 ; i++) {
            swap(arr,i , arr.length - 1 -i);
        }
    }

    static void swap(int[] arr, int i, int i1) {
        int temp = arr[i1];
        arr[i1] =  arr[i];
        arr[i]  = temp;
    }
}
