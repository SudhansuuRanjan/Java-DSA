package com.assignments;

import java.util.Arrays;

public class MaximumProductofThreeNumbers {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n-3]*nums[n-2]*nums[n-1];
    }
}
