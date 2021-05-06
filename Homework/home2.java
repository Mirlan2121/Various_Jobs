package com.company;

import java.util.Scanner;

public class home2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double cels, farh;
        System.out.println("Введите градусы Цельсия: ");
        cels = scan.nextDouble();
        farh = (cels * 1.8) + 32;
        System.out.printf("Вывод значения в Фаренгейтах: %.2f", farh);
    }
}
