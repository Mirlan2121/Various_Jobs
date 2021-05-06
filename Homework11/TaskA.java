package company.Homework11;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(getChect(num));

    }
    static boolean getChect(int num){
    return num % 2 == 0;
    }

}

