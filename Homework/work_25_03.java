package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class work_25_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите три числа:");
        int a = scanner.nextInt(), b = scanner.nextInt(); //c = scanner.nextInt();
//        if (a == b && a == c) {
//            System.out.println(a + " = " + b + " = " + c);
//        }
//        if (a == b || a == c && c != a) {
//            System.out.println("Два одинакавых чисел:");
//        }
//        if (a != b && a != c && b != a) {
//            System.out.println("Нет одинаковых чисел:");
//         switch (a){
//             case 1:
//                 System.out.println("Январь:");
//                 break;
//             case 7:
//                 System.out.println("Июль:");
//                 break;
//             case 12:
//                 System.out.println("Декабрь:");
//                 break;
//             default:
//                 System.out.println("непва");
//         }

//            if (a > b && a > c){
//                System.out.println("Антон старше всех" + a);
//            }else{
//                if(a == b && a > )
//            }
//            if ( a < b && c < b  ){
//                System.out.println("Борис старше всех" + b);
//            }
//            if ( c > a && c > b ){
//                System.out.println("Виктор старше всех" + c);
//            }
//            if (a == b && a >)
//            else{
//                System.out.println("равны");
//            }
        System.out.println(a != b ? " a != b ": " a == b");
        System.out.println(a > b ? a : (a == b ? "равны" : b));
//    }
    }
}




