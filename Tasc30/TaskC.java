package com.company;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int num, sum = 0;
        num = scan.nextInt();

        if (num > 0 && num < 1000000) {
            while (num > 0)  {
                sum = sum + num % 10;
                num = num /10;
            } System.out.println(" Sum of numbers:" + sum);

        }
    }
}

