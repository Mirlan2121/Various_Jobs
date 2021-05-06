package com.company.Classwork;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numb = scan.nextInt();
        int sum = 0;
        if (numb > 0 && numb < 1000000) {
            while (numb > 0) {

                sum = sum + numb % 10;//
                numb = numb / 10;
                System.out.println(sum);
            }

        }

    }
}
