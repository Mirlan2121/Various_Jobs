package com.company;

import java.util.Scanner;

public class coal2603 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int coA, coB, coC, form, sum;
        coA = scan.nextInt();
        coB = scan.nextInt();
        coC = scan.nextInt();
        form = coA + coB + coC;
        sum = 180;
        if (coA > 0 && coA < 90) {


            if (coB > 0 && coB < 90) {

            }
            if (coC > 0 && coC < 90) {

            }
            if (form == sum) {
                System.out.println("yes");
            }
            if (form > sum && form < sum) {
                System.out.println("No");

            } else {
                if ((coA == 0 || coB == 0) || coC == 0)
                    System.out.println("the angle of the parameters zero does not exist");
            }
        }
    }
}





