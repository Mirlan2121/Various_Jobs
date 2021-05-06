package com.company;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        num1 = scan.nextInt();
        num2 = scan.nextInt();

        if (num1 > num2) {// А больше Б
            while (num1 > num2 ) { // Первый цикл А больше Б
                if (num1 % 2 == 1) { //Формула который находить не четные числа.
                    System.out.println("odd numbers :" + num1);

                }
                num1--;// Счетчик
            }
        }

        if (num2 > num1) {//Б больше А
            while (num2 > num1 ) { // Второй цикл который работает в обратном порядке
                if(num2 % 2 == 1) {
                    System.out.println("odd numbers :" + num2);
                }
                num2--;
            }

        }else if(num1 == num2){// Если обе числа равны друг другу.
            System.out.println("Error:");
        }
    }


}










