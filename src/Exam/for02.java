package Exam;

public class for02 {
    public static void main(String[] args) {
        int sum = 0;
        int A[] = {1,2,3,4,5,6,7,8,9,10};
        int n = A.length;
        for(int i = 0; i < n; i++) {
            sum = sum + A[i];
        }
        System.out.println((float) (sum/n));
    }

}
