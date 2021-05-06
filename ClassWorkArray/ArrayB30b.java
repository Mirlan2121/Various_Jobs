package com.company;

import java.util.Random;
import java.util.Scanner;

public class ArrayB30b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//ввод в терминал
        Random ran = new Random();//рандом
        System.out.println("Enter number: ");//вывод текста
        int box15, box17,box21;
        box15 = 15;
        box17 = 17;
        box21 = 21;
        int num = 186;
        int count =0;
        for (int i = 0; i <= num/box15; i++ ){
            for (int j = 0; j <= num/box17; j++){
                for (int k =0; k <= num/box21; k++){
                    count++;
                    System.out.println("15kg: " + i + "," + ", 17kg: " + j + "," + ", 21kg: " + k);
                }
//        int number1 = scan.nextInt();
//        int number2 = scan.nextInt();
//        for (int i = number1; i < number2; i++ ){
////            int count = 0;
////            for (int j = 2; j <= i/2; j++) {
//                if (i % j == 0) {
//                    count++;
//
//                }
//
//            }
//            if (count ==0){
//                System.out.println(i +  " ");
//            System.out.println("Внешный цикл: " + i);
//            for (int j = 0; j  < 3; j ++){
//                System.out.println("Внутреный цикл: " + j);
//                for (int k = 0; k  < 3; k ++){
//                    System.out.println("Внутреный цикл2: " + k);
//
//                    }
            }
        }
    }
}
