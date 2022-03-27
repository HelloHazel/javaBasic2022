package chap11;

class Computer8 {

    String os;
    int memory;

    //필드변수 값 표시 메소드
    public void show(){
        System.out.println("OS는 " + os + "입니다.");
        System.out.println("Memory는 " + memory + "GB 입니다.");
    }
}

public class ObjectInitializationObjectVariable {
    public static void main(String[] args) {
        //Computer8에 객체변수 com1 선언하고 객체 생성
        Computer8 com1 = new Computer8();

        //com1의 객체 값 설정
        com1.os = "Windows 11";
        com1.memory = 32;

        //Computer8의 객체변수 com2 선언과 동시에 다른 변수로 초기화
        Computer8 com2 = com1;
        System.out.println("com2에 com1을 할당합니다.");

        //com1의 show메소드에 액세스
        System.out.println("com1 PC : ");
        com1.show();

        //com2의 show메소드에 액세스
        System.out.println("com2 PC : ");
        com2.show();
    }


}
