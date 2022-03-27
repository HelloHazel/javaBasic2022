package chap08;

public class CreateArray {
    public static void main(String [] args) {
        int [] jasonAPT;
        jasonAPT = new int[3];

        System.out.println("jasonAPT값 : " + jasonAPT );
        System.out.println("0호실 값 : " + jasonAPT[0]);
        System.out.println("1호실 값 : " + jasonAPT[1]);
        System.out.println("2호실 값 : " + jasonAPT[2]);

        for(int i = 0; i < jasonAPT.length; i++ ){
            System.out.println(jasonAPT[i]);
        }

    }
}
