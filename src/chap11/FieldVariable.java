package chap11;

class Computer2 {

    String os;
    int memory;
    int disk;
}

public class FieldVariable {

    public static void main(String[] args) {

        Computer2 com = new Computer2();

        com.os = "Windows 11";
        com.memory = 32;
        com.disk = 124;

        System.out.println("컴퓨터 OS는 " + com.os + "입니다.");
        System.out.println("매모리 크기는 " + com.memory + "GB 입니다.");
        System.out.println("디스크 용량은 " + com.disk + "GB 입니다.");
    }
}
