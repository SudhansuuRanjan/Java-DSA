package com.assignments;

import java.util.ArrayList;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0){
                arr.add(nums[i]);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 1){
                arr.add(nums[i]);
            }
        }

        int[] ans = new int[arr.size()];
        for (int i = 0; i < arr.size() ; i++) {
            ans[i] = arr.get(i);
        }

        return ans ;

    }
}
