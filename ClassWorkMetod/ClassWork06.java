package com.company;


import java.util.Random;

class ClassWork06 {
    public static void main(String[] args) {
        Random ran = new Random();
        int min = 1;
        int max = 9;
        int[][] arrayNum = new int[3][3];
        int sum = 0;
        int count = arrayNum.length * arrayNum[0].length;
        for (int i = 0; i < arrayNum.length; i++) {
            for (int j = 0; j < arrayNum[i].length; j++) {
                arrayNum[i][j] = ran.nextInt(max - min + 1) + min;
                sum = sum + arrayNum[i][j];
            }
        }
        for (int i = 0; i < arrayNum.length; i++) {
            for (int j = 0; j < arrayNum[i].length; j++) {
                System.out.print(arrayNum[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println(sum / count +  " Арифметчискей ");
        System.out.println(count + " Количество ");
    }
}

//        String[][] array = {{"Asan", "Essen", "Uson"},
//                {"Sosed1", "Sosed2", "Sosed3"},
//                {"Inna", "Egor", "Alex"}};
//        int[][] arrayNum = {{1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}};
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.printf("Etag %s: index: %s = %s\n", i, arrayNum[i][j], array[i][j]);






