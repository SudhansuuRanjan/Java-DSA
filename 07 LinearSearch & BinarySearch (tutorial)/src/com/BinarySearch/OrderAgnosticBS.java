package com.BinarySearch;

import java.util.Scanner;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = { -1 , -2, -5 , -12 , -29 , -34 , -46 , -67 , -89 , -100};
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int result = OrderAgnosticBinarySearch(arr , target);
        if( result >= 0){
            System.out.println("Found !!!\n"+"Index : " + result);
        }
        else{
            System.out.println("Not found !!!");
        }
    }

    static int OrderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            // int mid = (start + end) / 2 ; ( In bigger values might exceed limit
            int mid = start + (end - start) / 2;
             if (arr[mid] == target){
                return mid;
            }
             if (isAscending){
                 if (target < arr[mid]) {
                     end = mid - 1;
                 } else {
                     start = mid + 1;
                 }
             }
             else{
                 if (target > arr[mid]) {
                     end = mid - 1;
                 } else{
                     start = mid + 1;
                 }
             }
        }
        return -1;
    }
}
