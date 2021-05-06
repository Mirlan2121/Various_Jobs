package com.company;

import java.util.Random;
import java.util.Scanner;

public class ArrayMount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 1, max = 12;
        int a;
        Random ran = new Random();
        String[] mount = new String[13];
        mount[0] = "ERROR(0)";
        mount[1] = "January(1):";
        mount[2] = "February(2)";
        mount[3] = "March(3)";
        mount[4] = "April(4)";
        mount[5] = "May(5)";
        mount[6] = "June(6)";
        mount[7] = "Jule(7)";
        mount[8] = "August(8)";
        mount[9] = "September(9)";
        mount[10] = "October(10)";
        mount[11] = "November(11)";
        mount[12] = "December(12)";
        for (int num = scan.nextInt();num >0; num--) {
            a = ran.nextInt(13);
            System.out.println(mount[a]);
        }
    }

}
