package com.sudhanshu;

public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2 , 6 , 7896 , 7979};
        int count = 0;
        for (int num : nums) {
            int x = (int) (Math.log10(num) + 1);
            if (x % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
