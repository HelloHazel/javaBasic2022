package Exam;

public class Exam05 {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++)
            gugudanColum(i);
    }
    //구구단 메소드 작성
    static void gugudanColum(int num){
        for(int i =1; i < 9; i++)
            System.out.printf(" %2d", num * i);

        System.out.println();
    }
}


