package com.sudhanshu;

import java.util.Arrays;

public class SearchInASortedMatrix {

    public static void main(String[] args) {
        int[][] arr = {
                {1 , 2 , 3 , 4},
                {5 , 6 , 7 , 8},
                {9 , 10 , 11 , 12},
                {13 , 14 , 15 , 16}
        };
        System.out.println(Arrays.toString(binarySearch2D( arr , 1))); ;
    }

    static int[] binarySearch(int[][] arr ,int r , int cStart , int cEnd , int target){
       while ( cStart <= cEnd){
           int mid = cStart + ( cEnd - cStart) / 2 ;
           if( arr[r][mid] == target ){
               return new int[]{r , mid} ;
           }
           if( arr[r][mid] < target) {
               cStart = mid + 1;
           }else {
               cEnd = mid -1 ;
           }
       }
       return new int[]{-1,-1} ;
    }

    static int[] binarySearch2D(int[][] arr,  int target) {
        int r = arr.length ;
        int c = arr[0].length;

        if( r == 1){
            return binarySearch( arr , 0 ,0 ,c-1 ,target) ;
        }

        int rStart = 0 ;
        int rEnd = r -1 ;
        int cMid = c / 2 ;

        while( rStart < (rEnd -1)){
            int mid = rStart + ( rEnd - rStart) / 2 ;

            if( arr[mid][cMid] == target){
                return new int[]{mid,cMid} ;
            }
            if( arr[mid][cMid] < target){
                rStart = mid ;
            }else{
                rEnd = mid ;
            }

        }

        //now we have two rows
        //check whether the target is in thr col of two rows

        if( arr[rStart][cMid] == target){
            return new int[]{rStart,cMid} ;
        }
        if( arr[rStart + 1][cMid] == target){
            return new int[]{ rStart + 1,cMid} ;
        }

        // search in 1st half
        if( target <= arr[rStart][cMid - 1]){
            return binarySearch(arr , rStart , 0 , cMid - 1 , target);
        }
        // search in 2nd half
        if( target >= arr[rStart][cMid + 1] && target <= arr[rStart][c - 1]){
            return binarySearch(arr , rStart , cMid + 1 , c - 1 , target);
        }
        // search in 3rd half
        if( target <= arr[rStart + 1][cMid - 1]){
            return binarySearch(arr , rStart + 1, 0 , cMid - 1 , target);
        }
        // search in 4th half
        else{
            return binarySearch(arr , rStart + 1 , cMid + 1 ,  c -1 , target);
        }

    }
}
