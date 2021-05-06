package OOP;

public class Picture {
    public static void main(String[] args) {
        Sketch picture = new Sketch();
        Object picture2 = new Object();
        Object2 picture3 = new Object2();

        System.out.println("Эскиз обьекта");
        picture.name = "Настрой";
        picture.structure = "Дерево и бумага";
        picture.shape = "Квадрат";
        picture.color = "Синий";

        System.out.println("Внутренный обьекта");

        picture2.name = "Что биётса в каждом";
        picture2.color = "Ала красный";
        picture2.shape = "Сердце";

        System.out.println("Внутренный обьект 2");

        picture3.name = "Сияюший цвет надежды";
        picture3.color = "Золотисто белый";
        picture3.shape = "Звезда";

        System.out.println("Эскиз обьекта");
        System.out.println(" Имя: " + picture.name + " , " + " Cтруктура: " + picture.structure + " , " + " Форма: " + picture.shape + " , " + "Цвет: " + picture.color);
        System.out.println("Внутренный обьекта");
        System.out.println(" Имя: " + picture2.name + " , " + " Форма: " + picture2.shape + " , " + "Цвет: " + picture2.color);
        System.out.println("Внутренный обьект 2");
        System.out.println(" Имя: " + picture3.name + " , " +  " Форма: " + picture3.shape + " , " + "Цвет: " + picture3.color);
    }
}
// Задача С
// 1. Что такое парадигма ООП?
// 1. это система понятий и идей, определяюший стиль написаний кода, а также образ мышленни програмиста.
// 2. Что такое классы в Java?
// 2. Класс – логическое описание чего-либо, шаблон, с помощью которого можно создавать реальные экземпляры этого самого чего-либо. Другими словами, это просто описание того, какими должны быть созданные сущности: какими свойствами и методами должны обладать.
// 3. Что такое свойства класса?
// 3. Свойства – характеристики сущности, методы – действия, которые она может выполнять. Описание обьекта детално.
// Примеры для задачи
// 4.Как создать экземпляр класса (объект)?
// public class Picture {
// public static void main(String[] args) {
// rezume student  = new rezume ();
// student.name = " Alex";
// student.age = 19;
// student.specialty = "програмист";
// student.id = 20301349;
//
//System out println(student.name, student.age, student.specialty, student.id);
//  }
//}
//class rezume();{
//String name;
//int age ;
//String specialty;
//int id;
//}