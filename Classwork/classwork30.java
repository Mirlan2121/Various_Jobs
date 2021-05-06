package com.company.Classwork;

import java.util.Scanner;

public class classwork30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        //num = num %2 == 0 ? num
        System.out.println("Введите число:");
        for (; ; ) {// счетчик работает только внутри тело for внешном работат не будет
          int num = scan.nextInt();
          if (num == 0) break;
          count++;
          sum += num;
        }
        for (int i = scan.nextInt(); i != 0; count++, i = scan.nextInt())
        System.out.println("Count:" + count);
        System.out.println("Общий сумма:" + sum);
        System.out.println("средне арифметическое:" + (float )sum / count);
        //System.out.printf("%d * %d = %d\n", num, num2,  i,i*num2, i*num);

        //if(i % 2 == 0) // Нечетно

//        for(int k = 1; k < 10; k++){ //Cтепены возвидение
//       // while (k <= 10){
//            System.out.println(n);
//           n = n * 2;
//            //k++;
    }
}

