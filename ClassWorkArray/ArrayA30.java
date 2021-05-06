package com.company;

import java.util.Scanner;

public class ArrayA30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];
        numbers[1] = scan.nextInt();


        for (int i = 0; i <= numbers.length; i++){
            numbers[i] = i*10;
            System.out.println(i);
        }
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println();

        int[] numbers1 = {1,2,3};
        for (int i = 0; i <= numbers1.length; i++){
            System.out.println(numbers1);
        }
    }
}
