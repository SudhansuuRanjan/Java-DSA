package com.sudhanshu;

//Searching in a range of index

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = { 23, 21 , 2 , 12 , 71 , 5 , 8 , 15, 8 };
        int target = 15;
        int start = 1 , end = 4;
        int ans = linearSearch(nums , target , start , end);
        System.out.println(ans);
    }
    static int linearSearch( int[] arr , int target , int start , int end){
        if( arr.length  == 0){
            return -1;
        }
        for( int i = start ; i < end ; i++){
            if( arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
