package com.company;

public class TaskArrayC {
    public static void main(String[] args) {
        int[] array = new int[11];
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                sum = i * j;
                System.out.printf("%d * %d = %d", j , i, sum );
                System.out.println();
            }
        }
    }
}
