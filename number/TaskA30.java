package com.company.number;

import java.util.Scanner;

public class TaskA30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int start, end;
        int sum = 0;
        start = scan.nextInt();//Диапозон чисел который введеть пользователь начало
        end = scan.nextInt();//Конечный диапозон
        for (start = 10; start < end; start++)//Сколько чисел должен выводится в консоль про межутке между началой и конца
            if (start % 2 == 0) {//Формула или точне логичекий блок который выводит четные числе промужитке начало и конца работает она разделея числет на два и если
                //она равна нулю то цикл выводит это число на консоль до тех пор пока цикл не дойдет конечнуму числу который мы задали
                //так же можно и вывести нечетные числа просто изменив на функсую не.
                sum += start;//Вычитывает общийколичество чисел и прибавляет их друг другу
                System.out.println("Odd number: " + start );// вывод всех чисел равныю на нечетные.

            }
        System.out.println("Sum of number: " + sum);//Конечный сумма всех чисел
    }
}
