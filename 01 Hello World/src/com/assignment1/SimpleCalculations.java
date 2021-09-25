package com.assignment1;

import java.util.Scanner;

public class SimpleCalculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int n1 = input.nextInt();
        System.out.println("Enter Second number : ");
        int n2 = input.nextInt();
        System.out.println("Enter the operand ( + , - , * , /) : ");
        char op = input.next().charAt(0);

        if (op == '+'){
            System.out.println("Sum is : "+ (n1 + n2));
        }
        else if (op == '-'){
            System.out.println("Difference is : "+ (n1 - n2));
        }
        else if (op == '*'){
            System.out.println("Product is : "+ (n1 * n2));
        }
        else if (op == '/'){
            System.out.println("Sum is : "+ (n1 / n2));
        }
        else{
            System.out.println("Invalid Operator");
        }

    }
}
