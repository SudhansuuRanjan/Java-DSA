package com.sudhanshu;

import java.util.Scanner;

public class WeekdayWeekend {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("WeekDay");
            case 6, 7 -> System.out.println("WeekEnd");
            default -> System.out.println("invalid input !!");
        }
    }
}
