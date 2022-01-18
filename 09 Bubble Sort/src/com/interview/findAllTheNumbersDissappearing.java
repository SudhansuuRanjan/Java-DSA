package com.interview;

import java.util.ArrayList;
import java.util.List;

public class findAllTheNumbersDissappearing {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0 ;
        while( i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                Swap(arr, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length ; j++) {
            if( arr[j] != j+1){
                ans.add( j+1 );
            }
        }
        return ans ;
    }

    static void Swap( int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp ;
    }
}
