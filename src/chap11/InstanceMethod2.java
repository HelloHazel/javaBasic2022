package chap11;

class Computer5{
    String os;
    int memory;

    //메세지와 함께 pc정보를 표현하는 메소드
    public void showComputer(){
        System.out.println("PC정보를 표시합니다.");
        show();
    }
    public void show(){
        System.out.println("OS는 " + os + "입니다.");
        System.out.println("Memorysms " + memory + "GB입니다.");
    }
    //필드변수에서 OS 값을 얻음
    public String getOs(){
        return os;
    }

    //필드 변수에 memory 값을 설정하는 메소드
    public int getMemory(){
        return memory;
    }

    //필드 변수에 값을 설정하는 메소드
    public void setOsMemory(String name, int size) {
        os = name;
        memory = size;
        System.out.println("OS는 " + name + "이고, 메모리코드를 " +size + "GB로 변경했습니다다");
    }
}public class InstanceMethod2 {
    public static void main(String[] args) {

        // Computer5클래스에 객체 생성
        Computer5 com = new Computer5();

        // 객체의 필드 변수에 각 데이터를 저장함
        com.os = "Windows 11";
        com.memory = 32;

        // 메소드를 사용하여 필드 변수에 저장된 데이터를 가져옴
        System.out.println("PC OS는 " + com.getOs() + "입니다.");
        System.out.println("메모리 크기는 " + com.getMemory() + "GB입니다.");

        // 객체 필드변수에 각 데이터를 다시 저장함
        com.setOsMemory("Windows 10", 16);

        // showComputer 메소드 호출
        com.showComputer();
    }
}
