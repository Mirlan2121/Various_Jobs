package Homework16;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Animal  parrot = new Animal();
        parrot.setName("Гена");
        parrot.setAge(scan.nextInt());
        parrot.setWeight(scan.nextInt());
        parrot.setHeight(scan.nextInt());
        parrot.setColor("Радужный");
        parrot.setView(parrot.getView());
    }

}
