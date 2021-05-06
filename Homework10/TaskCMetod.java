package company.Homework10;

import java.util.Random;

public class TaskCMetod {
    public static void main(String[] args) {
    int[][] array = new int[3][3];
    printArray(array);
    printNumber(array);

    }
    static void printArray(int[][] array){
        Random ran = new Random();
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j <array [i].length; j++){
                array[i][j] = ran.nextInt(30);
                System.out.print(array[i][j] + " ");
            }
        }
    }
    static void printNumber (int[][] array){
        int sum = 0;
        for (int i = 1; i < array.length + 1; i++){
            for (int j = 1; j < array[i].length + 1; j++){
                System.out.println(sum);
            }
        }
    }

}
