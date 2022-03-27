package chap05;

import java.util.Scanner;

public class KeyboardInputStringValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("나이 입력: ");
        int age = sc.nextInt();
        System.out.println("내 나이는 " + age + "입니다.");


    }
}
