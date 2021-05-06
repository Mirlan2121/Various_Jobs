package com.company;

import java.util.Scanner;

public class homestring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
//        String str2 = scan.nextLine();
        if (str1.equals("abc")){
            System.out.println("Hello the user");

        }if (str1.equals("ABC")){
            System.out.println("HI the user");
        }


        else{

            System.out.println("не вел буквы");
        }
//        if (str2 == "hello"){
//            System.out.println("Hello the user" + str2);

    }
}
