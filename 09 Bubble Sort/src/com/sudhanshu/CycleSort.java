package com.sudhanshu;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Swap( int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp ;
    }

    static void cyclicSort(int[] arr) {
        int i = 0 ;
        while( i < arr.length){
            int correct = arr[i] - 1;
            if( arr[i] != arr[correct]){
                Swap(arr , i , correct);
            }else{
                i++;
            }
        }
    }
}
