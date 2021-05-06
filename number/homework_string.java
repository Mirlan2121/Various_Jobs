package com.company;

import java.util.Scanner;

public class homework_string {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c, d, e, f, k, p, g, x = 5, y =4;
        a = 1;
        b = 2;
        c = 3;
        d = 4;
        e = 5;
        f = 6;
        k = 1.1;
        p = 1.2;
        g = 1.3;
        double sum;
        sum = (((a + b) * c + d * (e / f)) / (k + p * (b / a) + g))  * (y / x);
        System.out.println("Сумма:" + sum);
    }
}
