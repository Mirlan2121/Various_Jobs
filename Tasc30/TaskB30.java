package com.company;

import java.util.Scanner;

public class TaskB30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");//Ввод чисел
        int num = scan.nextInt();
        int fact = 1;//Переменная факторияла
        for (int i = 1; i <= num; i++) {//
            fact = fact * i;//Фактория который умножает (промежутечные числа) или 1,2,3,4,5,6,7,8,9 только одно число
            // 5 * 4 * 3 * 2 * 1 = 120
            if (num > 0 && num < 10) {//Сравннение число больше ноля и при этом больше десяти граниса допустимых чисел
                System.out.println("Факториал чисел:" + fact);// Каждое число 1-9 пре умножается

            } else if (num >= 10) {// Если число больше или равно десяти то выводится следушая сторока или актвиривоется логический блок else
                System.out.println("Error");

            }
        }
    }
}
