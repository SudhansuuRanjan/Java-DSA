package com.intermediateassignment;

import java.util.Scanner;

public class CGPAcalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of subjects : ");
        int n = in.nextInt();
        System.out.println("Enter you total gp : ");
        int tgp = in.nextInt();
        int cg = tgp/n;
        System.out.println("CGPA : "+ cg);
        }

    }

