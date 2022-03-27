package chap14Excercise;

class cal2{
    static int addition(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    static double addition(double num1, double num2){
        double sum = num1 + num2;
        return sum;
    }
}
public class Calc1 {
    public static void main(String[] args) {
        cal2 calc = new cal2();
        int num1 = 10;
        int num2 = 20;
        System.out.println(num1 + " + " + num2 + " + " + " = " + calc.addition(num1,num2));
        double num3 = 45.2;
        double num4 = 16.9;
        System.out.println(num1 + " + " + num2 + " + " + " = " + calc.addition(num3,num4));

    }


}
