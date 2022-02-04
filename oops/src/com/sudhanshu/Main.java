package com.sudhanshu;

public class Main {

    public static void main(String[] args) {

       Student Student1 = new Student();

        Student1.rno = 2002006;
        Student1.name = "Sudhanshu Ranjan";
        Student1.marks = (float) 8.56;

        Student1.show();

    }

    static class Student{
        int rno ;
        String name;
        float marks;

        Student(){

        }

        void show(){
            System.out.println(rno);
            System.out.println(name);
            System.out.println(marks);
        }
    }

}
