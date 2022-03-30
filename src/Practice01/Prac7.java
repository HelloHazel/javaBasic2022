package Practice01;

import java.util.Random;
import java.util.Scanner;

public class Prac7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] dayKorean = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
        String[] dayEnglish = {"Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday", "Sunday"};

        String answer = new String();
        Random rd = new Random();

        int day = 0;
        int last = 8;

        System.out.println("요일명을 영어 소문자로 입력하시오.");
        while(true) {
            while (true) {
                day = rd.nextInt(8);
                if (day==last) continue;
                else {
                    last = day;
                    break;
                }
            }

            while (true) {

                System.out.print(dayKorean[day]+": ");
                answer = sc.next();
                if (answer.toLowerCase().equals(dayEnglish[day].toLowerCase())) {
                    break;
                }
                else {
                    System.out.print("틀렸습니다.");
                    System.out.println();
                    continue;
                }
            }

            System.out.print("정답입니다. 다시한번? 1 (yes)/0 (no)");
            int contin = sc.nextInt();
            if (contin==0) {
                System.out.println("프로그램 종료.");
                break;  // 종료}
            }
            else {
                continue;}

        }
    }
}
