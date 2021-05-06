package company.JW21;



public class ClassWork10 {
    public static void main(String[] args) {
        System.out.println("Before");
        int result = doSomething(1);
        System.out.println("result: " + result);
        doSomething(1);
        System.out.println("After");
    }

    static int doSomething(int num) {
        if (num < 10) {
            return num;
        }
        return 0;
    }
}
//        System.out.println(getCountRate("USD"));
//        System.out.println(getCountRate("RUS"));
//        System.out.println(getCountRate("KZT"));
//        System.out.println(getCountRate("KG"));
//        double sum = 1 + getCountRate("USD");
//    }

//    static double getCountRate(String currencyCode) {
//        double rate;
//        switch (currencyCode) {
//            case "USD":
//                rate = 69.5;
//                break;
//            case "RUS":
//                rate = 1.05;
//                break;
//            case "KZT":
//                rate = 0.2;
//                break;
//            case "KG": rate = 1.0;
//            break;
//            default:
//                rate = 1;
//        }
//        return rate;
//    }
//   int result = getCountSum(userNumber);
//      if (result > 10){
//          System.out.println("Больше десяти");
//      }else{
//          System.out.println(result);
//      }


// int sum = 0;
//        while (Number > 0) {
//        sum = sum + Number % 10;
//        Number = Number / 10;
//        }
//        return sum;
//    int sunMain = getCountSum(2,3,5);
//        System.out.println("sumMain: " + sunMain);