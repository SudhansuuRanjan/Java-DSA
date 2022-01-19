package com.assignments;

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionofTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> temp = new ArrayList<>();

        for (int j : nums1) {
            set.add(j);
        }

        for (int j : nums2) {
            if (set.contains(j)) {
                set.remove(j);
                temp.add(j);
            }
        }

        int[] ans = new int[temp.size()];
        for (int i = 0; i < temp.size() ; i++) {
            ans[i] = temp.get(i);
        }

      return ans;
    }
}
