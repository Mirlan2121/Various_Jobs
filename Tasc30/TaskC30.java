package com.company;

import java.util.Scanner;

public class TaskC30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Диапозон чисел");
        int numA, numB;
        numA = scan.nextInt();
        numB = scan.nextInt();
        for (numA = 0;numA < numB; numA ++ ){
            if (numA % 3 == 0){
                System.out.println("Числы деленые на три:" + numA);
            }
        }
    }
}
