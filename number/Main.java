package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num, key;
        double sum, number, count = 0 ;
        double arith;
        sum = 0;
        while (true){
            System.out.println("Введите число; ");
            key = scan.nextInt();
            num = key;
            sum = sum + key;
            count = count+1;
            if (key == 0){
                arith = sum / count;
                System.out.println("Количество введеных чисоль: " + count);
                System.out.println("Сумма введеных чисел: " + sum);
                System.out.printf("Среднее арифметическое значение введенных чисел: %.2f", arith );
            }
        }

    }
}



