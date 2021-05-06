package company.ClassWorkMetod;


public class ClassWork13 {
    public static void main(String[] args) {
        System.out.println(fibbonaci(6));
}

    static int fibbonaci(int n) {
        int result = 1;
        if (n == 0) return 0;
        if (n == 1) return 1;
        int sum = 0;
        return fibbonaci(n - 1) + fibbonaci(n - 2);
    }
}



//    }
//    static int sum(int num){
//        if (num == 0) return 0;
//        return num%10 + sum(num / 10);

//    }
//    static  void recursionFuntion(int n){
//
//        System.out.println("NOW: " + n);
//        if (n == 3) return;
//            System.out.println("Call:" + n);
//            recursionFuntion(n + 2);


