package com.sudhanshu;

public class OOPsIntro {
    public static void main(String[] args) {

        Student Student1 = new Student(2002006,"Sudhanshu Ranjan",8.56f);
        Student Student2 = new Student(2002003,"Harsh Kumar",8.4f);
        Student Student3 = new Student();

        Student1.show();
        Student2.show();
        Student3.show();
        Student Student4 = Student1;
        Student1.name= "Deepak Ranjan";
        Student4.show();

    }

    static class Student{
        int rno;
        String name;
        float marks;

        Student(){
            this(2002001 , "Suraj" , 100.0f);
        }

        Student(int rollNo ,String studentName , float studentMarks){
            this.rno = rollNo;
            this.name = studentName;
            this.marks = studentMarks;
        }

        void show(){
            System.out.println("roll no = " + rno + "\nname = "+ name + "\nmarks = "+ marks + "\n");
        }
    }
}
