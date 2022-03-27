package 객체;

public class Computer {
    String os;
    String cpu;
    int memory;

    public void start() {
        System.out.println("시작되었습니다.");
    }

    public void finish(){
        System.out.println("종료되었습니다.");
    }

    public void browse(){
        System.out.println("웹서핑을 시작합니다.");
    }
}
class pcTest {
    public static void main(String[] args) {
        Computer com;
        com = new Computer();
        com.os = "windows 11";
        com.browse();
        com.finish();

    }
}
