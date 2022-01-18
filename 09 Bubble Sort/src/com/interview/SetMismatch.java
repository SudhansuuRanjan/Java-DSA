package com.interview;

public class SetMismatch {
    public int[] findErrorNums(int[] arr) {
        int i = 0 ;
        while( i < arr.length){
            int correct = arr[i] - 1;
            if( arr[i] != arr[correct]){
                Swap(arr , i , correct);
            }else{
                i++;
            }
        }

        for (int j = 0; j < arr.length ; j++) {
            if( arr[j] != j+1){
                return new int[] {arr[j] , j+1} ;
            }
        }

        return new int[] {arr[arr.length-1] , arr.length} ;
    }

    static void Swap( int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp ;
    }
}
