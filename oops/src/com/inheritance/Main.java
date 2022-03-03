package com.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(4.6 , 3.6 ,6.7);
        Box box1 = new Box(box);
        BoxWeight b1 = new BoxWeight();
        System.out.println(box.l + " " + box.h + " " + box.w);
        System.out.println(box1.l + " " + box1.h + " " + box1.w);
        System.out.println(b1.l + " " + b1.h + " " + b1.w +" "+ b1.weight);
    }
}
