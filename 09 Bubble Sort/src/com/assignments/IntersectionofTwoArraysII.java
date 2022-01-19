package com.assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionofTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> temp = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int first = 0 , second = 0 ;

        while(true){
            if( first >= nums1.length || second >= nums2.length ){
                break;
            }
            if( nums1[first] == nums2[second]){
              temp.add(nums1[first]);
              first++;
              second++;
            }
            else if( nums1[first] > nums2[second]){
                second++;
            }
            else if(nums1[first] < nums2[second]){
                first++;
            }

        }


        int[] ans = new int[temp.size()];
        for (int i = 0; i < temp.size() ; i++) {
            ans[i] = temp.get(i);
        }

        return ans;
    }
}
