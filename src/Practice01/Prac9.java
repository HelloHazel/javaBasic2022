package Practice01;
import java.util.GregorianCalendar;

import java.util.Random;

public class Prac9 {
    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();
        int y = today.get(GregorianCalendar.YEAR);         //연
        int m = today.get(GregorianCalendar.MONTH) + 1;    //월
        int d = today.get(GregorianCalendar.DATE);
        System.out.println("오늘은 " + y + "년 " + m + "월 " + d + "일입니다.");


        Random rd = new Random();
        int k = rd.nextInt(10);
        System.out.print("오늘의 운세는 ");
        switch (k) {
            case 0:
                System.out.print("대길 ");
                break;
            case 1:
            case 2:
            case 3:
                System.out.print("길 ");
                break;
            case 4:
            case 5:
            case 6:
                System.out.print("중길 ");
                break;
            case 7:
            case 8:
                System.out.print("소길 ");
                break;
            case 9:
                System.out.print("흉 ");
                break;
        }
        System.out.println("입니다.");
    }
}