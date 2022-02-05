package com.problems;


public class linkedList {
    private Node head;
    private Node tail;
    private int size;
    public linkedList(){
        this.size = 0;
    }

    public  Node gethead(){
        return head;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void getNodeLength(){
        System.out.println(size);
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size +=1;
    }

    public void insert(int val , int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val , temp.next);
        temp.next = node;
        size++;

    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size -1){
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        return val;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display(){
        Node temp = head;
        while( temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void displayReverse(Node temp){
        if( head == null){
            System.out.println("Empty list");
            return;
        }
        else {
            if (temp.next == null) {
                System.out.print("End <- " + temp.value);
                return;
            }
            displayReverse(temp.next);
            System.out.print(" <- " + temp.value);
        }
    }

    public void palindromeCheck(){
        Node temp = head;
        boolean flag = true;
        int mid = (size%2 == 0)? (size/2) : ((size+1)/2);

        for(int i=1; i<mid; i++){
            temp = temp.next;  // mid node
        }

        Node revHead = reverseList(temp.next);

        while(head != null && revHead != null){
            if(head.value != revHead.value){
                flag = false;
                break;
            }
            head = head.next;
            revHead = revHead.next;
        }

        if(flag)
            System.out.println("linked list is a palindrome!");
        else
            System.out.println("linked list is not a palindrome");

    }

    private Node reverseList(Node temp) {
        Node current = temp ;
        Node prevNode = null, nextNode = null;

        while(current != null){
            nextNode = current.next;
            current.next = prevNode;
            prevNode = current;
            current = nextNode;
        }
        return prevNode;
    }

    public class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public  Node(int value , Node next){
            this.value = value;
            this.next = next;
        }
    }

}