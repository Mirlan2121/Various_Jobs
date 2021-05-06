package company;

import java.util.Random;


public class TaskAMetod {
    public static void main(String[] args) {
        int[][] Numarray = new int[5][5];
        ran(Numarray);//метод рандом
        Min(Numarray);//метод минимал
        Max(Numarray);//метод максимал
    }
    static void ran(int[][] arrayRan) {// Метод вывода случайных числе в массиве 5 на 5 диапозон чисел от 0 до 255.
        Random ran = new Random();
        for (int i = 0; i < arrayRan.length; i++) {
            for (int j = 0; j < arrayRan.length; j++) {
                arrayRan[i][j] = ran.nextInt(255);
                System.out.print(arrayRan[i][j] + " ");
            }
            System.out.println();
        }
    }
        static void Min(int[][] array) {// Нахождение минималный число в массиве и его индекс
            int min = array[0][0];
            int x = 0, y = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i][j] < min) {
                        min = array[i][j];
                        x = i;
                        y = j;
                    }
                }
            }
            System.out.println();
            System.out.print("A[" + x +"]["+ y + "]" + "=" + min + "Min");
        }
            static void Max(int[][] arrayMax){// Нахождение максималный число в массиве и его индекс
                int max = arrayMax[0][0];
                int x = 0, y = 0;
                for (int i = 0; i < arrayMax.length; i++) {
                    for (int j = 0; j < arrayMax.length; j++) {
                        if (arrayMax[i][j] > max) {
                            max = arrayMax[i][j];
                            x = i;
                            y = j;
                        }
                    }
                }
                System.out.println();
                System.out.print("A[" + x + "][" + y + "]" + "=" + max + "Max");
            }
        }

