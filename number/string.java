package com.company;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Привет, как тебя зовут");
        String name = scan.nextLine();
        System.out.println(name + ", приятно познакомиться");
        System.out.println("Каком году ты родился");
        int birth_year =scan.nextInt();
        int age = 2021 - birth_year;
        System.out.println("Вам " + age + "лет");
    }
}
