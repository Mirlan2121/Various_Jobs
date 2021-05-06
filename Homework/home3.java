package com.company;

import java.util.Scanner;

public class home3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int unit, doz, hum;
        unit = num % 10;
        num = num / 10;
        doz = num % 10;
        hum = num / 10;
        System.out.println("Сотни: " + hum + ",Десятки: " + doz + ",Единицы: " + unit + ".");
    }
}
