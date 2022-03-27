package chap11exercise;

class Person01 {
    String name; // 이름
    int age; // 나이

    // 필드변수의 값을 화면에 메시지로 보냄
    public void showPerson() {
        System.out.println("이 사람의 이름은 " + this.name + "이고, 나이는 " + this.age + "살입니다.");
    }
}

class chap11exercise {

    public static void main(String[] args) {
        Person01 person1 = new Person01(); // Person02객체를 2개 작성
        Person01 person2 = new Person01();// Person02객체를 2개 작성

        person1.age = 20;        // 개별 객체의 필드 변수에 값을 설정

        person1.name = "박지성";

        person2.age = 22;        // 개별 객체의 필드 변수에 값을 설정

        person2.name = "이제노";

        person1.showPerson(); // 메소드에 액세스하여 개별결과를 표시
        person2.showPerson();
    }

    class Person03 {

        String name; // 이름
        int age; // 나이

        // 필드변수의 값을 화면에 메시지로 출력
        public void showPerson() {
            System.out.println("이 사람의 이름은 " + this.name + "이고 나이는 " + this.age + "입니다.");
        }

        // 메소드①
        public void setName(String name) {
            this.name = name;// 여기에 처리 추가
        }

        // 메소드②
        public void setAge(int age) {
            this.age = age;    // 여기에 처리 추가
        }

        // 메소드③
        public String getName() {
            return this.name;    // 여기에 처리 추가
        }

        // 메소드④
        public int getAge() {
            return this.age;    // 여기에 처리 추가
        }
    }
}

