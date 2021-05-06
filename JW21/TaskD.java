package com.company;


public class TaskD {
    public static void main(String[] args) {
        int num;
        num = 10000;
        while (9999 < num && num < 100000) {
            if (num % 133 == 125) {
                System.out.println("при деление 133 остаток 125:" + num);

            }
            num++;
            if (num % 134 == 111) {
                System.out.println("при деление 134 остаток 111:" + num);
            }
            num++;
        }
    }
}