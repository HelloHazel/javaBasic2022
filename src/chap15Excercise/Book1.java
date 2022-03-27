package chap15Excercise;

public class Book1 {

    private static int count = 0;
    private String title;
    private int price;
    private int number;

    public Book1(String title, int price) {
        ++count;
        this.title = title;
        this.price = price;
        this.number = count;
    }

    public void showBook(){
        System.out.println("이 책의 제목은 " + this.title + "이고 가격은 " + price + "원입니다");
        System.out.println("생성횟수는 " +this.number + "입니다.");
    }

    public static int getCount() {
        return count;
    }

}

