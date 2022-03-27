package chap08;

public class ArrayInitializer {
    public static void main(String[] args){

        int[] jasonAPT1 = new int[3];

        jasonAPT1[0] = 3;
        jasonAPT1[1] = 1;
        jasonAPT1[2] = 10;

        System.out.println(" - 제이슨아파트 1동 거주년수 : ");
        System.out.println("0호 :" + jasonAPT1[0]);
        System.out.println("1호 :" + jasonAPT1[1]);
        System.out.println("2호 :" + jasonAPT1[2]);

        System.out.println();

        int[] jasonAPT2 = {3, 11, 10};

        System.out.println(" - 제이슨아파트 2동 거주년수 : ");
        System.out.println("0호 :" + jasonAPT2[0]);
        System.out.println("1호 :" + jasonAPT2[1]);
        System.out.println("2호 :" + jasonAPT2[2]);
    }
}
