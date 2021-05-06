package company.Homework11;

import java.util.Random;

public class TasKC {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++){
            array[i] = ran.nextInt(10-1+1)+1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        array(array);
    }
    static void array(int[] array){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] == array[j]){
                    count++;
                    if (count == 1){
                    System.out.print("Есть ");}
                    break;
                }
            }
        }
        if (count == 0){
            System.out.println("NO");
        }
    }
}
