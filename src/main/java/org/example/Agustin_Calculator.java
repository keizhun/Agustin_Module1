package org.example;

import java.util.Scanner;

public class Agustin_Calculator {
    public static void main(String[] args) {
        Double sum, sub, div, mul;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        Double number1 = input.nextDouble();

        System.out.print("Enter Second Number: ");
        Double number2 = input.nextDouble();

        sum = number1 + number2;
        sub = number1 - number2;
        mul = number1 * number2;
        div = number1 / number2;

        System.out.println("\n\n" + "Addition: "+sum);
        System.out.println("Subtraction: "+sub);
        System.out.println("Multiplication: "+mul);
        System.out.println("Division: "+div);
    }
}
