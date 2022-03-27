package chap07;

public class practice0703 {
    public static void main(String[] args){

        for(int i = 1 ; i <= 40; i++){

            if(i%2==1){
                //4의 경우 다시 반복 처음으로 돌아감
                continue;
            }
            if(i>20){
                break;
            }
            System.out.println(i);
        }
    }
}


