package com.sudhanshu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SubarraySum {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 1, 0, 3, 1};
        printSubArrays(arr);
    }
    static void printSubArrays(int [] arrA){
        ArrayList<Integer> list = new ArrayList<>(10);
        int arrSize = arrA.length;
        //start point
        for (int i = 0; i <arrSize ; i++) {
            //group sizes
            for (int k = i; k <=arrSize ; k++) {
                int Sum = 0;
                for (int j = i ; j < k ; j++) {
                    Sum += arrA[j];
                }
                list.add(Sum);
            }
        }
        Set<Integer> distinctElement = new HashSet<>(list);
        System.out.println(distinctElement.size());
    }
}
