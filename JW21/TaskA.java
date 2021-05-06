package com.company;

import java.util.Scanner;

public class TaskA{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A, B, i;
        A = scan.nextInt();
        B = scan.nextInt();

        while (A <= B ) {
            if (B % 2 == 0) {
                System.out.println(B);
            }
            B--;
        }

    }


}


