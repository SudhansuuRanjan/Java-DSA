package com.assignments;

public class MissingNumber {
    public int missingNumber(int[] arr) {
        int i = 0 ;
        while( i < arr.length){
            int correct = arr[i] - 1;
            if( arr[i] != arr[correct]){
                Swap(arr , i , correct);
            }else{
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[i] != j+1){
                return j+1;
            }
        }

        return arr.length + 1 ;
    }
    static void Swap( int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp ;
    }
}
