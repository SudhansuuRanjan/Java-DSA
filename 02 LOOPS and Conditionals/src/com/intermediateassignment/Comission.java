package com.intermediateassignment;

import java.util.Scanner;

public class Comission {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter percentage comission : ");
        int c = in.nextInt();
        System.out.println("Enter Price in rupee : ");
        int p = in.nextInt();
        int com = (p * c)/100;

        System.out.println("Yor Comission is : " + com );
    }
}
