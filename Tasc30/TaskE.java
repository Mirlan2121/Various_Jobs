package com.company;

import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, r, temp, sum;
        num = scan.nextInt();
        temp = num;
        sum = 0;
        while (num > 0) {
            r = num % 10;// логиека которая разделяет числа 1,5,3.
            num = num / 10;
            sum = sum + r * r * r;// умнажает каждое число на себя три раза
        } if (temp == sum){// сумма сравниеватся если каждо умнаженая на себя три раза и их сумма равна не зависяма от чисел одному числу
            System.out.println("Число Амстронга: " );//

        }else
        System.out.println("Не число Амстронго: ");
    }

}

