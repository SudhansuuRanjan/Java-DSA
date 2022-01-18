package com.sudhanshu;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Test-1 marks : ");
        int test1 = in.nextInt();
        System.out.println("Enter Mid Sem marks : ");
        int midSem = in.nextInt();
        System.out.println("Enter Test-2 marks : ");
        int test2 = in.nextInt();
        System.out.println("Enter End Sem marks : ");
        int endSem = in.nextInt();

        float marks , gpa;
        marks = (test1 * 15 )/ 20 + (midSem*20) / 50 + (test2* 15) / 20+ (endSem*50) / 100 ;

            gpa = marks / 10 ;
        System.out.println("Total Marks of the student is : "+ marks);
        System.out.println("GPA of student is : "+ gpa);

    }
}
