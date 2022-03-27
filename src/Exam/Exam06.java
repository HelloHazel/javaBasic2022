package Exam;
import java.util.Scanner;
public class Exam06 {
    public static void main(String[] args) {

        class Method2 {
            static int calcSum(int num) {
                int count = 1;
                for (int i = 0; i < num; i++) {
                    count = i++;
                }
                return count;
            }
        }
    }
}









