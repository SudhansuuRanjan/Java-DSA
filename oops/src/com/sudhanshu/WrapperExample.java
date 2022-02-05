package com.sudhanshu;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20 ;
//
//        Integer num = 45;
        Integer a = 10;
        Integer b = 20;

        swap(a,b);
        System.out.println(a + " " + b);

        final A Sudhanshu = new A("Sudhanshu Ranjan");
        Sudhanshu.name = "Other name";

        // when a non primitive is final , you cannot reassign it.
//      Sudhanshu = new A("new Object");

    }

    static void swap( Integer a , Integer b){
        Integer temp = a ;
        a = b ;
        b = temp;
    }

    static class A {
        final int num = 10 ;
        String name ;

        public  A(String name){
            this.name = name ;
        }
    }

}
