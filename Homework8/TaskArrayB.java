package com.company;

import javax.swing.plaf.IconUIResource;
import java.util.Random;

public class TaskArrayB {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int count1 = 0;
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                count1 ++;
                System.out.println("A[" + i + "]" + "=" + max + "Max");
                System.out.println("Quantity number: " +count1);
            }
        }
        int count = 0;
        int min = array[9];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                count++;
                System.out.println("A[" + i + "]" + "=" + min + "Min");
                System.out.println("Quantity number: " + count);
            }
        }
    }
}