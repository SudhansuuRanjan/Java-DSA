package com.sudhanshu;

public class RichestCostomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 8} , {3 , 2 ,2}};
        int max = -1234567;
        for (int i = 0; i < accounts.length; i++) {
            int total = 0;
            for (int j = 0; j < accounts[i].length ; j++) {
                 total += accounts[i][j];
            }
            if( total > max ){
                max = total;
            }
        }
        System.out.println(max);

    }
}
