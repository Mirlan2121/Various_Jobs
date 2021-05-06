package com.company;

import java.util.Random;
import java.util.Scanner;

public class Array0104 {// Массивы

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//
        Random random = new Random();
        System.out.println("Enter number array:");
        int size = 5;
        int[] array = new int[size];
        double sum = 0;
        int min = 0;
        int max = 100;
        System.out.println("you array");
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
            System.out.print(array[i] + " ");
            sum += array[i];
        }
        for (int i = 0; i < size; i++) {
            sum = sum + array[i];
        }
        System.out.println();
        System.out.println("avegar:" + (float) sum / array.length);
    }
}
//        for (int i = 0; i < size; i++) {
    //  if (array[i] > 10 && array[i] < 20) {
//                count++;
//                sum = sum + array[i];
//                System.out.println(array[i] + " ");
//            }
//            System.out.println();
//            System.out.println("Количество:" + count);
//            float average = count > 0 ? (float) sum/count: 0 ;
//            System.out.println("Средний арифметичкекое : " + average);
//        }
//    }
//        for (int i = 0;i < size;i++) {
//            array[i] = random.nextInt();
//            System.out.println();
//        for (int i = 0; i < size; i++) {
//            System.out.println(array[i]);
//            System.out.printf("A[%d] =", i);
//            array[i] = scan.nextInt();
////        }
//        for (int i = 0; i < size; i++){
//            System.out.printf("A[%d] =", i);
//            array[i] = scan.nextInt();
//            System.out.println(array[i]);
//        }

//        int size = 10;
//        int i = 0;
//        int[] array = new int[size];
//        for(i = 0; i < size ; i++ ){
//            size = size*i;
//            System.out.println(i);}

//        array[0] = scan.nextInt();
//        array[1]
//        array[2]
//        array[3]
//        array[4]
//
