package chap06;

import java.util.Scanner;

public class NestedIfStatement1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("입력 : ");
        int a = sc.nextInt();
        System.out.println(" ====if문 판정 확인====" );

        if(a >= 0) {
            System.out.println("변수는 0 이상입니다.");
            if (a <= 10) {
                System.out.println("변수 a는 10 이하입니다.");
            } else {
                System.out.println("변수 a는 10보다 크다.");
            }
        }
        System.out.println(" ==== if문 판정 확인==== ");
    }
}
