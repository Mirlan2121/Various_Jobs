package company;


import java.util.Random;

public class TaskB {
    public static void main(String[] args) {
        Random ran = new Random();
        int[][] array = new int[5][5];
        int min = 10;
        int max = 99;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ran.nextInt(max - min + 1) + min;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int minArray = array[0][0];
        int maxArray = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < minArray) {
                    minArray = array[i][j];
                    minArray = i;
                    minArray = j;
                }
                if (array[i][j] > maxArray) {
                    maxArray = array[i][j];
                    maxArray = i;
                    maxArray = j;
                }
            }
        }
        System.out.printf("\nMin[%d][%d] = %d",minArray,minArray, minArray);
        System.out.printf("\nMax[%d][%d] = %d",maxArray,maxArray, maxArray);
    }
}
