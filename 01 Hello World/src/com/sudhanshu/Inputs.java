package com.sudhanshu;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your roll no : ");
        int rollno = input.nextInt();
        System.out.println("Your roll no is : " + rollno);

        String name = input.nextLine();
        System.out.println(name);
    }
}
