package 자바의정석예습;

import chap07.Array;

import java.util.Arrays;
import java.util.SplittableRandom;

public class 배열주요메서드 {
    public static void main(String[] args) {


        int[] arr = {0, 4, 2, 3, 1}; //1차원 배열 arr


        Arrays.sort(arr);  // 배열 정렬
        System.out.println(Arrays.toString(arr));

        int[][] arr2D = {{11, 12}, {11, 12}}; //2차원 배열


        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr2D)); // 2차원 배열 출력시에는 deep쓰기

        String[][] str2D = {{"ccc","bbb"}, {"AAA", "BBB"}};
        String[][] str2D2 = {{"aaa", "bbb"}, {"AAA", "BBB"}};

        System.out.println(Arrays.deepEquals(str2D, str2D2)); //두 2차원 배열이 같은지 아닌지 알고 싶을 때 쓰는 메서드

        int[] arr2 = Arrays.copyOfRange(arr, 2, 4); //배열 복사시에 쓰는 메서드 from, to(항상 to 뒤의 숫자에서 -1한만큼만 복사)
        System.out.println(Arrays.toString(arr2));


    }
}
