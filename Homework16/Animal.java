package Homework16;

public class Animal {

    //String skill;//умение
   // String difference;// отличия
    int age;// возраст
    int weight;// вес
    int height; //рост

    public String getColor() {// цвет
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    String color = "Радужный";

    public String getName(){// имя
    return name;
    }
    public void setName(String name){
        this.name = name ;
    }
    String name = "Гена";

    public String getView(){// Вид животного
        return view;
    }
    public void setView(String view){
        this.view = view;
    }
    String view = "Птица попугай";
    public String setDifference(){
        return difference;
    }
    public void getDifference(){
        this.difference = difference;
    }
    String difference = "Клюв,перия,ноги,глаза";
    public String getSkill(){
        return skill;
    }
    public void getSkill(String skill){
        this.skill = skill;
    }
    String skill = "Умение летат и говорить";

    public int getWeight() {
        return weight;
    }
    public void setWeight(int w) {
        if (w <= 0) {
            System.err.println("Нельзя задавать отрицательое знач");
        } else {
            weight = w;
            System.out.println("Одобрено");
        }

    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int h) {
        if (h <= 0) {
            System.err.println("Нельзя задавать отрицательое знач");
        } else {
            height = h;
            System.out.println("Одобрено");
        }
}
public int getAge() {
    return age;
}
public void setAge(int a){
        if (a <= 0){
            System.err.println("Нельзя задавать отрицательое знач");
        } else {
            age = a;
            System.out.println("Одобрено");
        }
}
}