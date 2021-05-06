package com.company;

import java.util.Scanner;

public class home1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3;
        double arith ;
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();

        System.out.println("Сумма:" + num1 + " + " + num2 + " + " + num3 + " = " + (arith = num1 + num2 + num3));
        System.out.println("Произведение:" + num1 + " * " + num2 + " * " + num3 + " = " + (num1 * num2 * num3));
        System.out.printf("Среднее арифметическое:" + "("+ num1 + " + " + num2 + " + " + num3 +") / 3 = " + "%.2f" , arith / 3);
    }
}
