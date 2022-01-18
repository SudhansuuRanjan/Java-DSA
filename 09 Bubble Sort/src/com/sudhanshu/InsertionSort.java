package com.sudhanshu;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 7876768 , 235345 , 555553 , 334235 , 553456 , 3351 , 9999 , 44242 , 1431346, 5234610};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Swap( int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp ;
    }

    static void insertionSort(int[] arr) {

        for (int  i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if( arr[j] < arr[j-1]){
                    Swap(arr , j , j-1);
                }else{
                   break;
                }

            }
        }
    }
}
