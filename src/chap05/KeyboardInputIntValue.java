package chap05;
import java.util.Scanner;

public class KeyboardInputIntValue {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.print("첫번째 숫자 입력? ");
//        int num1 = sc.nextInt();
//
//        System.out.print("두번째 숫자 입력? ");
//        int num2 = sc.nextInt();
//
//        System.out.println(num1 + " + " + num2 +  " = " + (num1 + num2));

        System.out.println("1 + 2 = " + 1 + 2); // ①
        System.out.println("1 + 2 = " + (1 + 2)); // ②
        System.out.println("3 * 4 = " + 3 * 4); // ③
        System.out.println("5 / 4 = " + 5 / 4.0); // ④
        System.out.println("9 % 7 = " + 9 % 7); // ⑤
    }
}
