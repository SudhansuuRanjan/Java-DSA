package com.sudhanshu;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = { 2 , 5 , 3 , 6 , 1 , 9 , 4 , 6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr){
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i ; j++) {
                if( arr[j] < arr[j-1] ){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
           if(!swapped){
               break;
           }

        }
    }
}
