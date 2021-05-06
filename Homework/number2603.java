package com.company;

import java.util.Scanner;

public class number2603 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
        if (a == b && a == c) {
            System.out.println("3");
        }
         else if (b == a || b == c || a == c){
                System.out.println("2");
        }else{
            System.out.println("0");
        }

        }
    }

