package Exam;

public class ExamP02 {

    public static void main(String[] args) {
        qestionP02(30);

    }

    private static void qestionP02(int h) {
        int n1 = 6000;
        int n2 = 5500;
        int n3 = 5000;
        int price = 0;

        if (h < 5) {
            price = h * 1;
        } else if (h < 20) {
            price = h * n2;
        } else {
            price = h * n3;
        }
        System.out.println("요금합계 : " + price + "원");
    }
}
