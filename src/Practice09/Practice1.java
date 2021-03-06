package Practice09;


public class Practice1 {
    public static void main(String[] args) {
        // Animal 배열형 변수 animals의 선언과 배열 객체 생성
        Animal[] animals = new Animal[3];
        // 동물들 배열 변수의 각 요소에 차례로 개, 고양이, 새 객체 생성 및 할당
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Bird();

        // for 루프를 사용하여 동물들의 배열 변수 확인 및 동물의 노래하는 sing 메서드 호출
        for(int i = 0; i < animals.length; i++){
            animals[i].sing();
        }
    }
}
// 동물 클래스
abstract class Animal {
    public abstract void sing();
}

class Dog extends Animal {
    public void sing() {
        System.out.println("멍 멍");
    }
}

class Cat extends Animal {
    public void sing() {
        System.out.println("야옹 야옹");
    }
}

class Bird extends Animal {
    public void sing() {
        System.out.println("뻐꾹 뻐꾹");
    }
}
