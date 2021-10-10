package com.sudhanshu;

import java.util.Arrays;
import java.util.Scanner;

public class ReversingArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        int[] arr = new int[index];
        int[] rev = new int[index];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            rev[arr.length - i - 1] = arr[i];
        }
        System.out.println(Arrays.toString(rev));

    }
}
