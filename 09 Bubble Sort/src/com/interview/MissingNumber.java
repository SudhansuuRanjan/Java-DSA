package com.interview;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int i = 0 ;
        while( i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length &&  nums[i] != nums[correct]){
                Swap(nums , i , correct);
            }else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j){
                return j;
            }
        }

        return nums.length ;
    }

    static void Swap( int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp ;
    }

}
