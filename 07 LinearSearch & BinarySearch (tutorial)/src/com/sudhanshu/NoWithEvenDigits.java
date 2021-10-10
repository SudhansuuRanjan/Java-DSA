package com.sudhanshu;

public class NoWithEvenDigits {
    public static void main(String[] args) {
        int arr[] = { 12 , 12 , 12, 3 , 1235};
        int  ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            count = (int) (Math.log10(arr[i]) + 1);
            if( count % 2 == 0 ){
                ++ans;
            }
        }
        System.out.println(ans);
    }

}
