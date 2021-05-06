package com.company;

import java.util.Scanner;

public class division2603 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        if (num1 % num2 == 0){
            System.out.println("division");
        }
        else{
                System.out.println("not shared");

        }
    }
}
