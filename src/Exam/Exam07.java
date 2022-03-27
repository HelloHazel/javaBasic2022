package Exam;

public class Exam07 {

    public static void main(String[] args) {
        for(int n = 11; n <= 20; n++){
            System.out.print(fibo(n) + " ");
        }

    }
    static int fibo(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibo(n-2) + fibo(n-1);
    }
}
