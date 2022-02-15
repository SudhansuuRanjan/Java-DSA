package com.problems;

public class main {
    public static void main(String[] args) {
//        linkedList list2 = new linkedList(); //1
//        list2.insertLast(9);
//        list2.insertLast(8);
//        list2.insertLast(7);
//        list2.insertLast(6);
//        list2.insertLast(5);
//        list2.display();   // 2 display
//        list2.getNodeLength();  // 3 length
//        list2.displayReverse(list2.gethead()); // 4 Reversed
//        list2.deleteFirst(); // delete first
//        System.out.println();
//        list2.display();

        linkedList list3 = new linkedList();
        list3.insertLast(1);
        list3.insertLast(2);
        list3.insertLast(5);
        list3.insertLast(2);
        list3.insertLast(1);
        list3.display();
//        list3.palindromeCheck();
        list3.delete(2);
        list3.display();

    }
}
