package chap04;

public class ChangeValue1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int a = 1; a <= 2; a++) {
            System.out.println("*");
        }
        for (int c = 1; c <= 15; c++) {
            System.out.print("\"");
        }
    }
}






//        //year
//        int year = 2002;
//
//        System.out.println("한국 월드컵은");
//        System.out.print(year);
//        System.out.println("년도에 개최되었습니다.");
//
//        //변수에 다른값 할당
//
//        year = 2018;
//
//        System.out.println("동계올림픽이");
//        System.out.print(year);
//        System.out.println("년도에 개최되었습니다.");
//    }
//}
