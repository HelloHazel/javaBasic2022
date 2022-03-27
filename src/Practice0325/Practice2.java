package Practice0325;

public class Practice2 {
    public static void main(String[] args) {
        // 첫 번째 애완동물 객체 생성
        Pet pet1 = new Pet();
        // 첫 번째 애완동물 데이터를 설정
        pet1.setType("개" );
        pet1.setName("해피");
        pet1.setAge((byte)4);
        pet1.setGender(false);
// 두 번째 애완 동물 객체 생성
        Pet pet2 = new Pet();
        // 두 번째 애완동물 데이터 설정
        pet2.setType("고양이");
        pet2.setName("야옹이");
        pet2.setAge((byte)2);
        pet2.setGender(true);
        // 검색하고 표시
        System.out.println(pet1.getIntroduction());
        System.out.println(pet2.getIntroduction());
    }
}
class Pet {
    private String type;
    private String name;
    private byte age;
    private boolean gender;

    //생성자
//    public Pet() {
//        this.type = null;
//        this.name = null;
//        this.age = 0;
//        this.gender = false;
//
//
//    }


    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(byte age) {
        this.age = age;

    }


    public boolean getGender() {
        return gender;
    }
        public void setGender(boolean gender){
            this.gender = gender;
        }



        public String getIntroduction () {
            System.out.println(this.type + " " + this.name + "는 " + this.gender + "이고 " + this.age + " 살입니다.");

            return null;
        }
    }


