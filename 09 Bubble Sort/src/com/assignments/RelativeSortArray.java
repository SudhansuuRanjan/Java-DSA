package com.assignments;

import java.util.HashMap;
import java.util.Map;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int k = 0;
        int[] cnt = new int[1001], ans = new int[arr1.length];

        for (int j = 0; j < arr1.length; j++) {
            int i = arr1[j];
            ++cnt[i];
        }

        for (int j = 0; j < arr2.length; j++) {
            int i = arr2[j];
            while (cnt[i]-- > 0)
                ans[k++] = i;
        }
        for (int i = 0; i < 1001; ++i)
            while (cnt[i]-- > 0)
                ans[k++] = i;
        return ans;
    }
}
