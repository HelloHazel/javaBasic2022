package Exam;


public class Renshu42 {
    public static void main(String[] args) {
        taxi(2450);
    }

    public static void taxi(int m) {
        int taxi = 6100;
        int price = 0;

        if (m < 1700) {
            price = taxi;
        } else {
            double increase = m - 1700;
            double num = increase / 313;


            price = Double.valueOf(taxi + (Math.ceil(num) * 800)).intValue();
        }

        System.out.println("택시요금 : " + price + "원");
    }
}











//    int (double)i = height, weight, bmi;
//        height = 1.75;
//        weight = 65.0;
//        bmi = (height/(weight*weight));
//
//        System.out.println("BMI = "+ bmi);
//
////        int x;
//        double y;
//        char z;
//
//        x = 1/2;
//        y = 1.0/ 2.0;
//        z = 'B';
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);
//        System.out.println("z = " + z);
