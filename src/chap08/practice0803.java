package chap08;

import java.util.Scanner;

public class practice0803 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] score = new int[5];
        int sum = 0;
        double avg = 0.0;

        for(int i=0; i<score.length; i++) {
            System.out.print((i+1) + "번째 숫자 입력 : ");
            score[i] = sc.nextInt();
        }

        for(int i=0; i<score.length; i++) {
            sum += score[i];
        }

//        avg = sum / score.length;

        System.out.println("합계: " + sum);
 //       System.out.println("평균: " + avg);
    }
}
