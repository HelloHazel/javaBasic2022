package chap11;

import 객체.Computer;

import java.sql.SQLOutput;

class Computer9{
    String os;
    int memory;

    //메세지와 PC 정보를 표시하는 메소드
    public void showComputer() {
        System.out.println("PC 정보를 표시합니다.");
    }

    //필드 변수의 값을 표시하는 메소드
    public void show(){
        System.out.println("OS는 " + this.os + "입니다."); //this 키워드 사용
        System.out.println("Memory는 " + this.memory + "GB 입니다.");
    }

    //필드변수에서 OS 값을 얻음
    public String getOs() {
        return this.os;
    }

    //필드변수에서 memory 값을 얻음
    public int getMemory() {
        return this.memory;
    }

    //필드변수에 값을 설정하는 메소드
    public void setOsMemory(String os, int memory) {
        this.os = os;
        this.memory = memory;
        System.out.println("OS는 " + os + "이고, 메모리는 " + memory + "GB입니다");
    }
}

public class ThisKeyWord {

    public static void main(String[] args) {

        //Coputer9 클래스에서 객체 생성
        Computer9 com = new Computer9();

        //객체 필드변수에 각 데이터를 저장
        com.os = "Windows 11";
        com.memory = 16;

        // 메소드를 사용하여 필드변수에 저장된 데이터 가져옴
        System.out.println("PC의 OS는 " + com.getOs() + "입니다.");
        System.out.println("메모리는 " + com.getMemory() + "GB 입니다.");

        //객체의 필드변수에 각 데이터를 다시 저장
        com.setOsMemory("Windows 10", 8);

        //showComputer 메소드를 호출하여 필드변수의 값 확인
        com.showComputer();
    }
}
