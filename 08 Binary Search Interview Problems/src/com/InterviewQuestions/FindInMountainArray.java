package com.InterviewQuestions;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18, 16, 14, 9, 5, 3, 2};
        int target = 14;
        int  peak = MountainPeak(arr);
        int firstTry = OrderAgnosticBinarySearch( arr , target , 0 , peak);
        if( firstTry != -1){
            System.out.println(firstTry);
        }
        else {
            System.out.println(OrderAgnosticBinarySearch(arr, target, peak + 1, arr.length - 1));
        }
    }

    static int MountainPeak(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid + 1] < arr[mid] && arr[mid - 1] < arr[mid]) {
                return mid;
            } else if (arr[mid - 1] < arr[mid]) {
                high = mid + 1;
            } else if (arr[mid + 1] < arr[mid]) {
                low = mid - 1;
            }

        }
        return -1;
    }

    static int OrderAgnosticBinarySearch(int[] arr, int target , int start , int end) {

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
