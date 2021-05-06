package company.JW21;

import java.util.Scanner;

public class Work14Class {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(getSum(number));
        System.out.println();
        System.out.println(getSumWithPow2(number));
        System.out.println();
        System.out.println(getSumWithPowN(number));

    }

    static int getSum(int num) {
        int result = 0;
        for (int i = 0; i <= num; i++) {
            result += i;
        }
        return result;
    }

    static int getSumWithPow2(int num) {
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result += Math.pow(i, 2);
        }
        return result;
    }

    static int getSumWithPowN(int num) {
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result += Math.pow(i, i) ;
        }
        return result;
    }
}

//        Scanner scan = new Scanner(System.in);
//        int number  = 3;
//        System.out.println(getSetNumber(number));
//        System.out.println(getSetNumber2(number));
//        System.out.println(getSetNumber3(number));
//    }
//    static int getSetNumber(int num){
//        if (num == 0) return 0;
//        return num + getSetNumber(num - 1);
//        }
//        static int getSetNumber2(int num){
//        if (num == 0) return 0;
//        return (num * num) + getSetNumber2(num - 1);
//    }
//    static int getSetNumber3(int num){
//        if (num == 0)return 0;
//        return (num * num + num) + getSetNumber3(num - 1) + getSetNumber3(num - 1);
