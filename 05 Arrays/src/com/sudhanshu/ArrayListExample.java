package com.sudhanshu;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(12);
        list.add(121);
        list.add(123);
        list.add(1245);
        list.add(1244);
        list.add(1243);
        list.add(1243);
        list.add(12);
        list.add(121);
        list.add(123);
        list.add(1245);
        list.add(1244);
        list.add(1243);
        list.add(1243);
        System.out.println(list);
        list.set(0,99);
        list.remove(2);
        System.out.println(list);
    }
}
