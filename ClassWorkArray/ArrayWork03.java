package com.company;

import java.util.Random;
import java.util.Scanner;

public class ArrayWork03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// ввод в терминал
        Random ran = new Random();//класс рандом случайный чисел
        int[] arr = new int[5];//массив размером 5
        for (int i = 0; i <  arr.length; i++){// цикл
            arr[i] = ran.nextInt(5);// выводить рандомный числа
            System.out.print(arr[i] + " ");// ввыводим через пробел
        }// первый логечиский блок
        System.out.println();//
        System.out.println("Введите число для поиска: ");// ввод
        boolean folen = false;// нахождение чегота
        int number = scan.nextInt();// числа который нужно найти
        for (int i = 0; i < arr.length; i++) {// цикл
            if (arr[i] == number) {// cравнивает есть ли похожие числа
                folen = true;// флаг который находить точно
                System.out.println("A[" + i + "]" + "=" + arr[i]);// i это индекс массива который мы хотим найти.
            }
        }
        if (!folen){//если не находит число то выводится
            System.out.print("Не нашли");
        }
    }
}
