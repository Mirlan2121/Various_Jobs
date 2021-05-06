package company.Homework11;

import java.util.Random;
import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(5 - 1 + 1) + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int number = scan.nextInt();
        int countNumber = getNumber(array, number);
        System.out.println("Количество " + countNumber);
    }
    static int getNumber(int [] array,int number) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                count++;
            }
        }
        return count;
    }
}
