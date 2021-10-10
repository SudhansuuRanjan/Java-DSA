package com.BinarySearch;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = { 1 , 2, 5 , 12 , 29 , 34 , 46 , 67 , 89 , 100};
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int result = BinarySearch(arr , target);
        if( result >= 0){
            System.out.println("Found !!!\n"+"Index : " + arr[result]);
        }
        else{
            System.out.println("Not found !!!");
        }
    }
    static int BinarySearch(int[] arr , int target){
         int start = 0;
         int end = arr.length - 1;
         while( start <= end){
            // int mid = (start + end) / 2 ; ( In bigger values might exceed limit
             int mid = start + (end - start) / 2;
             if( target < arr[mid] ){
                 end = mid - 1;
             }
             else if( target > arr[mid] ){
                 start = mid + 1 ;
             }
             else {
                 return mid ;
             }
         }
         return -1;
    }
}
