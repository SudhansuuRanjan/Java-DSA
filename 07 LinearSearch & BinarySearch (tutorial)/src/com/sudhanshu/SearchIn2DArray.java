package com.sudhanshu;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2} ,
                {14, 23 , -23},
                {78, 999 , 34 , 56},
                {18 , 12 }
        };
        int target = 12;
        int[]  ans = search(arr , target);
        System.out.println(Arrays.toString(ans));
        System.out.println( "Maximum value :  "+ max(arr));
    }

    static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if( arr[i][j] == target){
                    return new int[]{i+1 ,j+1} ;
            }

        }
      }
        return  new int[]{-1 ,-1};
    }

    // Maximum in 2D array

    static int max(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if( arr[i][j] > max){
                    max = arr[i][j];
                }

            }
        }
        return  max;
    }

}
