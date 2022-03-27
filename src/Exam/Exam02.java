package Exam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {

      //  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for(int i = 0; i <10; i++){
            int value = sc.nextInt();
            sum += value;
        }
        System.out.println("평균값 : " + (sum/10));
    }
}
