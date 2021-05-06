package company;

import java.util.Random;

class ClassWork08 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int min = 10;
        int max = 99;
        Random ran = new Random();
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = ran.nextInt(max + 1 - min) + min;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int minNumber = array[0][0];
        int maxNumber = array[0][0];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] < minNumber){
                    minNumber = array[i][j];
                    minNumber = i;
                    minNumber = j;
                }
                if (array[i][j] > maxNumber){
                    maxNumber = array[i][j];
                    maxNumber = i;
                    maxNumber = j;
                }
            }
        }
        System.out.printf("\nMinumber[%d][%d] = %d",minNumber,minNumber, minNumber);
        System.out.printf("\nMaxnumber[%d][%d] = %d",maxNumber,maxNumber, maxNumber);
    }
}
