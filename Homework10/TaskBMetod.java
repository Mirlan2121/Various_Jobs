package company.Homework10;

import java.util.Scanner;

public class TaskBMetod {
    public static void main(String[] args){
    number();

    }
    static void number(){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int unit, doz, hum;
        unit = num % 10;
        num = num / 10;
        doz = num % 10;
        hum = num / 10;
        System.out.println("Сотни: " + hum + ",Десятки: " + doz + ",Единицы: " + unit + ".");
    }
}
