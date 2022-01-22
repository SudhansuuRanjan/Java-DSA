package com.assignments;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
    static int heightChecker(int[] heights) {
        int[] arr = new int[heights.length];
        int ans = 0 ;
        System.arraycopy(heights, 0, arr, 0, heights.length);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(heights[i] != arr[i]){
                ++ans;
            }
        }

        return ans ;
    }
}
