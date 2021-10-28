package com.InterviewQuestions;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 3  ;
        int pivot = Pivot( nums );
        System.out.println(pivot);
    }

    static int Pivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1 ;
        while( start <= end){
            int mid = start + ( end - start );
            if( nums[mid] > nums[mid - 1] && nums[mid-1] > nums[mid]){
                return mid;
            }
            else if( nums[mid] > nums[mid- 1] )
            {
                start = mid + 1;
            }
            else if( nums[mid -1] > nums[mid] )
            {
                end = mid - 1;
            }
        }
        return -1;
    }
}
