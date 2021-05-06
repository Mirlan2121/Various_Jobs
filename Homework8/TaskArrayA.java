package com.company;

import java.util.Random;

public class TaskArrayA {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                System.out.println("A[" + i + "]" + "=" + max + "Max");
            }
        }
        int min = array[9];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                System.out.println("A[" + i + "]" + "=" + min + "Min");
            }
        }
    }
}
