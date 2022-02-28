package com.staticExample;

// this is a demo to show initialization of static variables
public class StaticBlock {
    static int a = 4;
    static int b;

    static {
        System.out.println("I am in static block");
        b = a * 2;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b) ;

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
