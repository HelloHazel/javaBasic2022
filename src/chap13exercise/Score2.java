package chap13exercise;

public class Score2 {

    String name; // 이름
    int[] score = new int[5]; // 5교과 점수 저장용 배열
    int total; // 총점
    double ave; // 평균점

    public Score2(String name, int[] score, int total, double ave) {
        this.name = name;
        // 인수 값으로 이름 설정
        // 여기에 처리 설명

        for(int i = 0; i < score.length; i++ ) {
            this.score[i] = score[i];
        }
        // 반복 문을 사용하여 인수 값으로 배열 설정
        // 여기에 처리 설명
        this.total = total;
        // 인수 값으로 총점 설정
        // 여기에 처리 설명

        this.ave = ave;
        // 인수 값으로 평균 점 설정
        // 여기에 처리 설명
    }

    public static void main(String[] args) {
        Score2 sc = new Score2("hello", new int[]{1,2,3,4,5}, 10, 100);
    }
}