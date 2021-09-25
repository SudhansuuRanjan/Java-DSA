package com.sudhanshu;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        //typecasting
//        int num = (int)(65.56f);
//        System.out.println(num);
//
//        //automatic type promotion in expressions
//        int n = 257;
//        byte m = (byte)(n);
//        System.out.println(m); // 257 % 256 = 1
//
//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a * b)/c;
//        System.out.println(d);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i/c) - (d * s);
        System.out.println((f * b) +"  "+ (i/c) +"  "+ (d * s));
        System.out.println(result);



    }
}
