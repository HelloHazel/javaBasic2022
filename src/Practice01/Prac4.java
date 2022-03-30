package Practice01;

import java.util.Scanner;

public class Prac4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("숫자맞추기 게임 시작!");
        num = (int)(Math.random()*90+10);

        System.out.println("10부터 99까지의 숫자를 맞추세요");

        while(true){
            int i;
            System.out.print("어떤 숫자일까?  ");
            i = sc.nextInt();
            if(num > i){
                System.out.println("더 큰 숫자입니다");
            } else if (num < i){
                System.out.println("더 작은 숫자입니다");
            }else if(num == i) {
                System.out.println("정답입니다.");
                break;
            }
        }
    }
}
