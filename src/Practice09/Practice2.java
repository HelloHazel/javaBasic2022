package Practice09;

public class Practice2 {
    public static void main(String[] args) {

        //센터 포워드 객체 생성
        SoccerPlayer fwd = new CenterForward("홍길동", 11);
        //자기소개
        System.out.println(fwd);
        //공을 처리
        fwd.kickBall();
        fwd.catchBall();
        System.out.println();

        //골키퍼 객체 생성
        SoccerPlayer Keeper = new GoalKeeper("이순신", 12);
        //자기소개
        System.out.println(Keeper);
        Keeper.kickBall();
        Keeper.catchBall();
    }
}
//축구 선수 추상클래스 생성
abstract class SoccerPlayer {

    private String name; //선수명
    private int uniformNumber; //등번호

    //생성자
    public SoccerPlayer(String name, int uniformNumber){
        this.name = name;
        this.uniformNumber = uniformNumber;
    }

    //getName 메소드 생성
    public String getName(){
        return name;
    }
    //kickBall 메소드 생성
    public void kickBall(){
        System.out.println(name + "은 공을 찼습니다");
    }
    //catchBall 메소드 생성
    public void catchBall(){
        System.out.println(name + "은 볼을 발로 받았습니다");
    }
    //추상메서드 getPositionName 생성
    public abstract String getPositionName();

    //toString으로 getPositionName 재정의
    @Override
    public String toString(){
        return getPositionName() + " " + name + " 번호 " + uniformNumber;
    }
}

//센터 포워드 클래스
class CenterForward extends SoccerPlayer{
    public static String POSITION_NAME = "센터 포워드";

    //선수이름 등번호 받는 생성자 생성
    public CenterForward(String name, int uniformNumber) {
        super(name, uniformNumber);
    }
    //getPositionName 구현
    public String getPositionName(){
        return POSITION_NAME;
    }
}

//골키퍼 클래스 생성 (방법은 위와 동일)
class GoalKeeper extends SoccerPlayer{
    public static String POSITION_NAME = "골키퍼";
    public GoalKeeper(String name, int uniformNumber){
        super(name,uniformNumber);
    }

    public String getPositionName() {
        return POSITION_NAME;
    }

    @Override
    public void catchBall(){
        System.out.println(getName() + "는 공을 손으로 받았습니다.");
    }
}