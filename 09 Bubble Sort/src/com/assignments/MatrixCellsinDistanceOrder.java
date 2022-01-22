package com.assignments;

import java.util.Arrays;
import java.util.Comparator;

public class MatrixCellsinDistanceOrder {

    public int[][] allCellsDistOrder(int R, int C, int r0 , int c0) {
        int[][] ans = new int[R * C][2];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                ans[i * C + j] = new int[] {i, j};
            }
        }
        Arrays.sort(ans, new Comparator<int[]>(){
            public int compare(int[] a, int[] b) {
                return Math.abs(a[0] - r0) + Math.abs(a[1] - c0)
                        - Math.abs(b[0] - r0) - Math.abs(b[1] - c0);
            }
        });

        return ans ;
    }
}
