package com.assignment1;

import java.util.Scanner;

public class Greetingmsg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name = input.nextLine();
        System.out.println("Hello! "+ name + " Welcome");
    }
}
