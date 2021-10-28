package com.InterviewQuestions;

public class FirstAndLast {
    public static void main(String[] args) {
    }
    public int[] searchRange(int[]  nums , int target) {
        int[] ans = {-1,-1};
        int start = search(nums , target , true);
        int end = search(nums , target , false);
         ans[0] = start;
         ans[1] = end;
         return  ans;
    }
         //function binary Search
     int search( int[] arr , int target , boolean findStartIndex){
         int ans = -1;
         int low = 0;
         int high = arr.length - 1 ;
         while( low <= high) {
             int mid = low + (high - low) / 2;
             if (arr[mid] < target) {
                 low = mid + 1;
             } else if (arr[mid] > target) {
                 high = mid - 1;
             } else {
                 ans = mid;
                 if( findStartIndex ){
                     high = mid - 1;
                 }else{
                     low =  mid + 1;
                 }

             }
         }
         return ans;
     }

    }