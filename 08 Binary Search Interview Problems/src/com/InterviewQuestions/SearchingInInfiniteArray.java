package com.InterviewQuestions;

public class SearchingInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = { 3 , 5, 7, 9, 90, 100, 130, 140, 160, 170};
        int target = 90;
        System.out.println(findingRange(arr, target));
    }
    static int findingRange( int[] arr , int target){
        int start = 0;
        int end = 1;
       while(target > arr[end]){
           int newStart = end + 1;
             end = end + ( end - start + 1) * 2;
             start = newStart;
       }
       return BinarySearch( arr , target , start , end);
    }
    static int BinarySearch(int[] arr , int target , int start , int end){
        int low = start;
        int high = end ;
        while( low <= high){
            int mid = low + (high - low)/2 ;
            if(arr[mid] < target){
                low = mid + 1;
            }
            else if(arr[mid] > target){
                high = mid -1 ;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
