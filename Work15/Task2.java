package company.Work15;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Экзамен №2");
        int number2 = 200;
        int sum = 0;
        int difference = 0;
        for (int i = 100; i < number2; i++) {
            if (i % 3 == 0) {
                sum += i;
                System.out.println();
                System.out.print("Сумма деленных на три: " + i);
            }
        }
        System.out.println();
        int sum2 = 0;
        for (int i = 100; i < number2; i++) {
            if (i % 4 == 0) {
                sum2 += i;
                System.out.println();
                System.out.print("Сумма деленных на четыри: " + i);
            }
        }
        System.out.println();
        difference = sum - sum2;
        System.out.printf("%d - %d = %d ",sum, sum2, difference);
        System.out.println("Вывод разницу двух сумм");
    }
}



