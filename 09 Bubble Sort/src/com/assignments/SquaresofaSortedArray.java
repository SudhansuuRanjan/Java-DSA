package com.assignments;

import java.util.Arrays;

public class SquaresofaSortedArray {
    public static void main(String[] args) {
        int[] arr =  {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
    static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int start = 0 , end = n - 1 ;
        int[] ans = new int[n];
        for (int j = end; j >= 0 ; j--) {
            if( Math.abs(nums[start])  > Math.abs(nums[end])){
                ans[j] = nums[start]*nums[start];
                start++;
            }else{
                ans[j] = nums[end]*nums[end];
                end--;
            }
        }
        return ans;
    }
}
