package chap08;

public class TwoDimensionArrayWithKukuDan {

    public static void main(String[] args){
        int[][] KuKuDan = new int[9][9];

        for(int dan = 0; dan < 9 ; dan++) {
            for(int i = 0 ; i < 9; i++) {
                KuKuDan[dan][i] = (dan +1) * (i +1);
            }
        }

        for(int dan = 0; dan < 9; dan++) {
            System.out.print((dan + 1) + "단 : ");
            for (int i = 0; i < 9; i++) {
                System.out.print(KuKuDan[dan][i] + "\t");
            }
            System.out.println();
        }
    }
}
