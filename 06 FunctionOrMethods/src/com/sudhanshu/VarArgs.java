package com.sudhanshu;

import java.sql.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,5,6,7,34,55,556,563,2,43,5,546,667,66776,6);
        multiple(2,3,"dhfsrsg","ffhgfg");
    }

     static void multiple(int a, int b , String ...v) {

    }
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
