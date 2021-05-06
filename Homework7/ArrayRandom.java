package com.company;

import java.util.Random;
import java.util.Scanner;

public class ArrayRandom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("Array size");
        int size = scan.nextInt();
        int j = 0, count = 0;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt( 6);
            System.out.print(array[i] + "\t");{
            }
            for ( i = 0; i < array.length - 1; i++){
                if (array[i] == array[i + 1]){
                    count++;
                }
            }
            int[] sumb = new int[count];
            for ( i = 0; i < array.length - 1; i++){
                if (array[i] == array[i + 1]){
                    sumb[j++] = array[i];
                }
            }
            if (count != 0){
                System.out.print("\nHave: ");
                for ( i = 0; i < sumb.length; i++)
                    System.out.print(sumb[i] + "\t");
                }else {
                System.out.println("\nNO");
            }
        }
    }

}