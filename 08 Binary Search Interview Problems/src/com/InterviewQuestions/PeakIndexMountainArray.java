package com.InterviewQuestions;
public class PeakIndexMountainArray {
    public static void main(String[] args) {
         int[] arr = {2, 3, 5, 9, 14, 16, 18};
         int target = 15;
         System.out.println(Ceil(arr, target));
    }

    static int Ceil(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while( low <= high){
            int mid = low + ( high - low)/2 ;
            if( arr[mid] < target )
            {
                low = mid + 1;
            }
            else if( arr[mid] > target)
            {
                high = mid - 1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[low];
    }

}
