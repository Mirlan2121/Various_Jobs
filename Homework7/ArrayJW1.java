package com.company;

import java.util.Random;
import java.util.Scanner;

public class ArrayJW1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int sum = 0;
        int min = 0;
        int max = 100;
        int size = scan.nextInt();
        int[] array = new int[size];
        System.out.println("you array");
        for (int i = 0; i < size; i++) {
            int count = 0;
            array[i] = random.nextInt(max - min + 1) + min;
            sum += array[i];

        }
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] > 0 && array[i] < 30) {
                count++;
                sum = sum + array[i];
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Средне арифметичкий диапозон от 0 до 30 :" + sum / count);
        System.out.println("Количество :" + count);
        int count1 = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] > 31 && array[i] < 60) {
                count1++;
                sum = sum + array[i];
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Средне арифметичкий диапозон от 31 до 60 :" + sum / count1);
        System.out.println("Количество :" + count1);
        int count2 = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] > 61 && array[i] < 100) {
                count2++;
                sum = sum + array[i];
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Средне арифметичкий диапозон от 61 до 100 :" + sum / count2);
        System.out.println("Количество :" + count2);
    }
}