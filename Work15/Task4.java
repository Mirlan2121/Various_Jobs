package company.Work15;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int human = scan.nextInt();
        if (human % 4 != 0){
            System.out.println("Обычный год");
        }else if (human % 100 != 0){
            System.out.println("Викосный год");
        }if (human % 400 == 0){
            System.out.println("Викосный год");
        }else System.out.println("Обычный год");{
        }
    }
}
