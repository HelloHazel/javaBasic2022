package Practice01;

import java.util.Scanner;

public class Prac6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 더합니다");
        System.out.print("몇 개를 더할까요: ");
        int num = sc.nextInt();

        int sum = 0; //합계
        int i;

        for (i = 0; i < num; i++) {
            System.out.print("정수: ");
            int a = sc.nextInt();
            if (sum + a > 1000) {
                System.out.println("합계가 1000을 넘었습니다.");
                System.out.println("마지막 값은 무시합니다.");
                break;
            }
            sum += a;
        }
        System.out.println("합계: " + sum);
        System.out.println("평균: " + sum / i);
    }

}

