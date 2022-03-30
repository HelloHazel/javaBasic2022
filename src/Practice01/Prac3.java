package Practice01;

public class Prac3 {
    public static void main(String[] args) {
        int comNum = (int)(Math.random() *3);
        System.out.print("컴퓨터가 낸것 : ");

        if (comNum == 0) {

            System.out.print("가위");

        } else if (comNum == 1) {

            System.out.print("보");

        } else {

            System.out.print("바위");

        }
    }
}
