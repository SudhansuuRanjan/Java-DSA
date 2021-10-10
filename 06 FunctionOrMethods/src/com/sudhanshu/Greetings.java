package com.sudhanshu;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String message = in.nextLine();
        greeting(message);
    }
    static void greeting(String msg){
        System.out.println(msg);
    }
}
