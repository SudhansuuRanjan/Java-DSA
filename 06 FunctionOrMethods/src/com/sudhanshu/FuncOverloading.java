package com.sudhanshu;

public class FuncOverloading {
    public static void main(String[] args) {
        fun(67);
        fun("Sudhanshu Ranjan");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String s){
        System.out.println(s);
    }

}
