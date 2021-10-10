package com.sudhanshu;

public class MaxAndMinNumber {
    public static void main(String[] args) {
        int[] a = { 15 , 23 , 56 , -1 , 465, 98 , 0 ,1223};
        System.out.println( "Minimum value is : " + min(a) + "\nMaximum value is : "+ max(a));

    }

     static int min(int[] a) {
        int ans = a[0];
         for (int j : a) {
             if (j < ans) {
                 ans = j;
             }
         }
         return ans;
    }
    static int max(int[] a) {
        int ans = a[0];
        for (int j : a) {
            if (j > ans) {
                ans = j;
            }
        }
        return ans;
    }
}
