package com.sudhanshu;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3 , 4, 5 , 9 , 14, 16 , 18};
        int target = 15;
        System.out.println(BinarySearch(arr,target));
    }
    static int BinarySearch(int[] arr , int target){
        int low = 0;
        int high = arr.length - 1 ;
        while( low <= high){
            int mid = low + (high - low)/2 ;
            if(arr[mid] < target){
                low = mid + 1;
            }
            else if(arr[mid] > target){
                high = mid -1 ;
            }
            else{
                return arr[mid];
            }
        }
        return arr[high];
    }
}
