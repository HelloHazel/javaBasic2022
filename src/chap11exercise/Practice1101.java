package chap11exercise;

class Person02 {
    String name; // 이름
    int age; // 나이

    // 필드변수의 값을 화면에 메시지로 보냄
    public void showPerson() {
        System.out.println("이 사람의 이름은 " + this.name + "이고, 나이는 " + this.age + "살입니다.");
    }
}

public class Practice1101 {

    public static void main(String[] args) {
        Person02 person1 = new Person02(); // Person02객체를 2개 작성
        Person02 person2 = new Person02();// Person02객체를 2개 작성

        person1.age = 20;        // 개별 객체의 필드 변수에 값을 설정

        person1.name = "박지성";

        person2.age = 22;        // 개별 객체의 필드 변수에 값을 설정

        person2.name = "이제노";

        person1.showPerson(); // 메소드에 액세스하여 개별결과를 표시
        person2.showPerson();
    }
        // ①의 사항 기술

        // ②의 사양 기술

        // 메소드에 액세스하여 개별결과를 표시
        // ③의 사양 기술
    }

