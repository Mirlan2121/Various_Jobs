package com.company;

import java.util.Scanner;

public class classwork2703 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int count = a % 10;
        a = a / 10;
        boolean rezulta = false;
        while (a > 0) {
            int current = a % 10;
            if (current == count) {
                rezulta = true;
                break;
            }
            count = current;
            a = a / 10;
            System.out.println("yes");
        }

//        do {
//            System.out.println("Enter number: ");
//            a = scan.nextInt();
//        } while (a >= 0);
//        System.out.println("good bye!");


//        int a = scan.nextInt(), b = scan.nextInt(); №2
//        int count = -0;
//        int sum = -0;
//        while (a > -1) {
////            sum += a;
////            count++;
//        }
//        System.out.println(sum);
//    }

//        while (count < 10){ №2
//            System.out.println("hello");
//            count++;
    }
}

