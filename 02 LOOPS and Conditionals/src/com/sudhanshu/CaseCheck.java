package com.sudhanshu;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z') {
            System.out.println("Small Case");
        }
        else if(ch >= 'A' && ch <= 'Z') {
            System.out.println("Capital Case");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
