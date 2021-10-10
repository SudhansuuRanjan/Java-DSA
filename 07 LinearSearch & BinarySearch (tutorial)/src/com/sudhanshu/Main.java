package com.sudhanshu;

public class Main {

    public static void main(String[] args) {
	 int[] nums = { 23, 21 , 2 , 12 , 71 , 5 , 8 , 15, 8 };
             int target = 1;
     int ans = linearSearch(nums , target);
        System.out.println(ans);

    }
    static int linearSearch( int[] arr , int target){
        if( arr.length  == 0){
            return -1;
        }
        for( int i = 0 ; i < arr.length ; i++){
            if( arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
