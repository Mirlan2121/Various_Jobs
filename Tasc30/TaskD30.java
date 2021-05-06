package com.company;

import java.util.Scanner;

public class TaskD30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numA, numB, numC;
        numA = scan.nextInt();
        numB = scan.nextInt();
        numC = scan.nextInt();
        for (;numA < numB; numA++) {
            if (numA % numC == 0)

                System.out.println("Числы деленые на число С:" + numA);
            }
        }
    }
