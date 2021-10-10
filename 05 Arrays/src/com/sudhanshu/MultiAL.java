package com.sudhanshu;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> List = new ArrayList<>();

        // initialisation
        for (int i = 0; i < 3; i++) {
            List.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                List.get(i).add(in.nextInt());
            }
        }
        System.out.println(List);
    }
}
