package com.assignments;

import java.util.Arrays;

public class LargestPerimeterTriangle {

    public static void main(String[] args) {
      int[]  nums = {2, 1, 2 } ;
        System.out.println(largestPerimeter(nums));
    }
    static int largestPerimeter(int[] arr) {
        Arrays.sort(arr);
        int perimeter = 0 , max = 0;
        for( int i = 0 ; i < arr.length - 2 ; i++){
            if(arr[i] + arr[i+1] > arr[i+2] && arr[i+2] + arr[i+1] > arr[i] && arr[i+2] + arr[i] > arr[i+1]){
                perimeter = arr[i] + arr[i+1] + arr[i+2] ;
                if(perimeter > max){
                    max = perimeter;
                }
            }
        }

        return max;
    }
}
