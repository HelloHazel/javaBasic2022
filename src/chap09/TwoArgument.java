package chap09;

public class TwoArgument {

    static void checkPass(int point, int passPoint) {

        if(point >= passPoint) {
            System.out.println(point + "점 합격!");
        }else {
            System.out.println(point + "점 불합격!");
        }
        System.out.println(" ======== ");
    }

    public static void main(String[] args) {

        int pointA = 85;
        int pointB = 32;
        int pointC = 60;
        int pointD = 40;

        System.out.print("A사마, ");
        checkPass(pointA, 50);

        System.out.print("B쿤, ");
        checkPass(pointB, 50);

        System.out.print("C쨩, ");
        checkPass(pointC, 50);


        System.out.print("D 오마에, ");
        checkPass(pointD, 50);



    }
}
