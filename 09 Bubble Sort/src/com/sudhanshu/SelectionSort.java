package com.sudhanshu;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 7 , 2 , 5 , 3 , 6 , 1 , 9 , 4 , 6};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int getMaxIndex(int[] arr , int start , int end){
        int max = start ;
        for (int i = 0; i <= end; i++) {
            if( arr[i] > arr[max]){
                max = i;
            }
        }
        return max ;
    }

    static void Swap( int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp ;
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
             int last = arr.length -i - 1;
             int maxIndex = getMaxIndex(arr , 0 , last);
             Swap(arr , maxIndex , last);
        }
    }
}
