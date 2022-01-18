package com.interview;

public class FindtheDuplicateNumber {
    public int findDuplicate(int[] nums) {
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
            if(nums[j] != j-1){
                return nums[j] ;
            }
        }

        return nums[nums.length - 1];
    }

    static void Swap( int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp ;
    }
}
