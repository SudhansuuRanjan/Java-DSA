package com.sudhanshu;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(56);
        System.out.println(list);

        LL list1 = new LL();
        list1.insertFirst(18);
        list1.insertFirst(12);
        list1.insertFirst(8);
        list1.insertFirst(9);
        list1.insertFirst(5);
        list1.insertFirst(3);

        list1.delete(3);

//          list1.deleteLast();
//          list1.display();
//          list1.deleteFirst();
//          list1.display();
//          list1.insert(100,3);
//           list1.display();
//           list1.insertLast(2131);
         list1.display();

        com.sudhanshu.LinkedList list2 = new com.sudhanshu.LinkedList();
        list2.insertLast(9);
        list2.insertLast(8);
        list2.insertLast(7);
        list2.insertLast(6);
        list2.insertLast(5);
        list2.display();
    }
}
