package com.company;

import java.util.Scanner;

public class TaskArray04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");//вывод текста
        int box15, box17, box21, box23, box25;
        box15 = 15;
        box17 = 17;
        box21 = 21;
        box23 = 23;
        box25 = 25;
        int num = 225;
        int count = 0;
        for (int i = 0; i <= num / box15; i++) {
            for (int j = 0; j <= num / box17; j++) {
                for (int k = 0; k <= num / box21; k++) {
                    for (int f = 0; f <= num / box23; f++) {
                        for (int d = 0; d <= num / box25; d++) {


                            count++;
                            System.out.println("15kg: " + i + "," + ", 17kg: " + j + "," + ", 21kg: " + k + "," + ", 23kg: " + f + "," + ", 25kg:" + "," + d);
                            System.out.println(count);
                        }
                    }
                }
            }

        }
    }
}