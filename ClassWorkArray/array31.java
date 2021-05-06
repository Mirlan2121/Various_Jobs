package com.company;

import java.util.Scanner;

public class array31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            boolean isPrime = true;//флаг
            for (int j = 2; j <= Math.floor(Math.sqrt(i)); j++){//если число i не простое,
                //то хотябы один делитель будет находится в промежутке от 2 до sqrt(i)
                if ((i % j) == 0) { //Если j - делитель числа, устанавливаем флаг на false
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i + " ");//если делителей нет, то флаг не изменится
            }
        }
    }
}
