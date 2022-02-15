package com.problems;

public class doublyLinkedList {
    private Node head;
    private Node tail;
    private int size;


    public void insertFirst(int val){
      Node node = new Node(val);
      node.next = head;
      node.prev = null;
      if(head != null){
          head.prev = node;
      }
      head = node;
    }

    public void display(){
        Node node = head;
        Node last = null;
        System.out.println("Normal Linked list");
        while( node != null){
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }
        System.out.print("End");
        System.out.println();

        System.out.println("Reversed Linked list");
        while(last != null){
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("End");

    }

    public class Node{
        private int value;
        private Node next;
        private Node prev;


        public Node(int value){
            this.value = value;
        }

        public Node(int val , Node next , Node prev){
            this.value = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
