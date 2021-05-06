package com.company;

import java.util.Scanner;

public class number_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c, d;
         a = scan.nextInt();
         b = scan.nextInt();
         c = scan.nextInt();
         d = scan.nextInt();
        a = (100 - ((b + c) * 2 * 3 - 10) / ((2 * 4 + d)) * d);
        System.out.println("Ответ:" + a);
    }
}
