package company.Work15;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Money = scan.nextInt();
        printMoney(Money);

    }

    static void printMoney(int num) {
        int sum = num;
        int count200 = 0;
        int count500 = 0;
        int count1000 = 0;
        int count2000 = 0;
        int count5000 = 0;
        if (num < 60000) {
            if (true) {
                while (sum > 200) {
                    count200++;
                    sum = sum - 200;
                    while (sum > 500) {
                        count500++;
                        sum = sum - 500;
                        while (sum > 1000) {
                            count1000++;
                            sum = sum - 1000;
                            while (sum > 2000) {
                                count2000++;
                                sum = sum - 2000;
                                while (sum > 5000) {
                                    count5000++;
                                    sum = sum - 5000;
                                    if (sum < 5000) {
                                        System.out.print("5000купюр: " + count5000 + " ");
                                    }
                                }
                                if (sum < 2000) {
                                    System.out.print("2000купюр: " + count2000 + " ");
                                }
                            }
                            if (sum < 1000) {
                                System.out.print("1000купюр: " + count1000 + " ");
                            }
                        }
                        if (sum < 500) {
                            System.out.print("500купюр: " + count500 + " ");
                        }
                    }
                    if (sum < 200) {
                        System.out.print("200купюр: " + count200 + " ");
                    }
                }
                System.out.println();
                sum  = num;
                while (sum  > 200) {
                    count200++;
                    sum = sum  - 200;
                    while (sum  > 500) {
                        count500++;
                        sum  = sum - 500;
                        while (sum  > 1000) {
                            count1000++;
                            sum  = sum  - 1000;
                            while (sum  > 2000) {
                                count2000++;
                                sum  = sum  - 2000;
                                if (sum  < 2000) {
                                    System.out.print("2000купюр: " + count2000 + " ");
                                }
                            }
                            if (sum  < 1000) {
                                System.out.print("1000купюр: " + count1000 + " ");
                            }
                        }
                        if (sum  < 500) {
                            System.out.print("500купюр: " + count500 + " ");
                        }
                    }
                    if (sum < 200) {
                        System.out.print("200купюр: " + count200 + " ");
                    }
                }

                System.out.println();
                sum = num;
                while (sum  > 200) {
                    count200++;
                    sum  = sum - 200;
                    while (sum  > 500) {
                        count500++;
                        sum  = sum - 500;
                        while (sum  > 1000) {
                            count1000++;
                            sum = sum - 1000;
                            if (sum < 1000) {
                                System.out.print("1000купюр: " + count1000 + " ");
                            }
                        }
                        if (sum < 500) {
                            System.out.print("500купюр: " + count500 + " ");
                        }
                    }
                    if (sum  < 200) {
                        System.out.print("200купюр: " + count200 + " ");
                    }
                }

                System.out.println();
                sum  = num;
                while (sum > 200) {
                    count200++;
                    sum  = sum  - 200;
                    while (sum  > 500) {
                        count500++;
                        sum  = sum  - 500;
                        if (sum  < 500) {
                            System.out.print("500купюр: " + count500 + " ");
                        }
                    }
                    if (sum < 200) {
                        System.out.print("200купюр: " + count200 + " ");
                    }
                }

                System.out.println();
                sum = num;
                while (sum  > 200) {
                    count200++;
                    sum = sum - 200;
                    if (sum < 200) {
                        System.out.print("200купюр: " + count200 + " ");
                    }
                }
            }else if( num % 200 != 0){
                System.out.println("Введенную ссуму не возможно снять!!!");
            }
        }
        else if(num < 0){
            System.out.println("Нельзя вводить отрецательную сумму!!!");
        }
        if (num > 60000){
            System.out.println("Лимит банкомата 60 000");
        }

    }


}

