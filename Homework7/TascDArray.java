package com.company;

import java.util.Random;
import java.util.Scanner;

public class TascDArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        Random ran = new Random();
        int number = scan.nextInt();
        int min = 0, max = 100;
        int count = 0, sum = 0;
        int[] array = new int[number];
        for (int i = 1; i < array.length; i++) {
            array[i] = ran.nextInt((max - min) + 1) + min;
            if (array[i] < 50) {
                sum = sum + array[i];
                count++;
                System.out.print(array[i] + " " );
            }
        }
        System.out.println();
        System.out.println("Средне арифметичкий диапозон от 0 до 50 :" + sum / count);
        System.out.println("Количество :" + count);

        int count1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 50 && array[i] < 100) {
                sum = sum + array[i];
                count1++;
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Средне арифметичкий диапозон от 50 до 100 :" + sum / count1);
        System.out.println("Количество :" + count1);
    }
}