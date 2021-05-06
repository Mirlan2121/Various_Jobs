package com.company;

import java.util.Scanner;

public class sum_of_numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, sum;
        num = scan.nextInt();
        sum = num * (num + 1) / 2;
        System.out.println("Cумма: " + sum);


    }
}
