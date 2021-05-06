package OOP;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Resume student = new Resume();

        student.name = " Мирлан ";
        student.age = 19;
        student.height = 180;
        student.weight = 55;
        student.specialization = " game development ";
        student.school = " Secondary Russian school ";

        Resume student2 = new Resume();
        student2.name = " Нурсултан ";
        student2.age = 29;
        student2.height = 176;
        student2.weight = 67;
        student2.specialization = " power engineer ";
        student2.school = " Secondary Russian school ";

        Resume student3 = new Resume();
        student3.name = " Астра ";
        student3.age = 30;
        student3.height = 150;
        student3.weight = 60;
        student3.specialization = " power engineer ";
        student3.school = " Secondary Russian school ";
        System.out.println();
        System.out.print("Имя:" + student.name + " " + "Возсрост: " + student.age + " " + "Рост: " + student.height + " " + "Вес: " + student.weight + " " + "Спецалность: " + student.specialization + " " + "Школа: " + student.school);
        System.out.println();
        System.out.print("Имя:" + student2.name + " " + "Возсрост: " + student2.age + " " + "Рост: " + student2.height + " " + "Вес: " + student2.weight + " " + "Спецалность: " + student2.specialization + " " + "Школа: " + student2.school);
        System.out.println();
        System.out.print("Имя:" + student3.name + " " + "Возсрост: " + student3.age + " " + "Рост: " + student3.height + " " + "Вес: " + student3.weight + " " + "Спецалность: " + student3.specialization + " " + "Школа: " + student3.school);

    }
}