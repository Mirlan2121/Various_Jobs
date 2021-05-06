package company;

import java.util.Random;

public class TaskBMetod {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        randNumb(matrix);
        System.out.println("Получина Матрица: \n");
        array(matrix);

        int sum = 0;
        int average;
        int count = 0;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                sum = sum + matrix[i][j];
                count++;
            }
        }
        average = sum / count;
        System.out.println("Среднея Яркость: " + average);
        System.out.println("Результат: ");
        System.out.println();

        correctArray(matrix,average);
    }
    static void array(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void randNumb(int [][] array){
        Random rand = new Random();
        int min = 0;
        int max = 255;
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = rand.nextInt(max - min + 1) + min;
            }
        }
    }
    static void correctArray ( int[][] array, int num){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(num > array[i][j]){
                    array[i][j] = 0;
                }
                if(num < array[i][j]){
                    array[i][j] = 255;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

