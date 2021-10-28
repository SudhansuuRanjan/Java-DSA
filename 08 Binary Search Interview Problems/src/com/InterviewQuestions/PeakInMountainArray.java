package com.InterviewQuestions;

public class PeakInMountainArray {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18 , 16 , 14 , 9 , 5, 3, 2};
        System.out.println(MountainPeak(arr));
    }

    static int MountainPeak(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while( low <= high){
            int mid = low + ( high - low)/2 ;
            if( arr[mid + 1] < arr[mid] && arr[mid - 1]  < arr[mid] ){
                return mid;
            }
            else if( arr[mid - 1]  < arr[mid]  )
            {
                high = mid + 1;
            }
            else if( arr[mid + 1] < arr[mid])
            {
                low = mid - 1;
            }

        }
        return  -1;
    }
}
