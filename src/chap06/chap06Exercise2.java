package chap06;

import java.util.Scanner;

public class chap06Exercise2 {
    public static void main(String[] args){

        
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력를 입력해주세요 : ");
// 1~2
        int num = sc.nextInt();

        if(0 <= num && num <= 9) {
            System.out.println("변수" + num+ "은 0이상 9 이하");
        }else if(0 < num && num > 9) {
            System.out.println("변수" + num + "은 0보나 작거나 9보다 크다");
        }
//3
        Scanner sc0 = new Scanner(System.in);
        System.out.println("5 혹은 999 중 숫자를 하나 입력해주세요 : ");

        int num1 = sc0.nextInt();
        if(num1 == 5 && num1 != 999); {
            System.out.println("변수" + num1 + "은 5와 같고 변수 num2는 999와 같지 않다.");
        }
//4

        char char1 = 'y';
        String str1 = "yes";

        if(str1 == "yes" || char1 == 'y');{
            System.out.println("변수 " +  char1 + "은 \'y\'와 같거나 변수 " + str1 + "은 \"yes\"와 같음");}
//5~7
        Scanner sc3 = new Scanner(System.in);
        System.out.println("month를 입력해주세요 : ");

        int month = sc3.nextInt();

        if(month >= 3 && month <= 8) {
            System.out.println("변수" + month + "는 3 이상 5 이하"); //봄
        }else if(month >= 6 && month <= 8) {
                System.out.println("변수" + month + "는 6 이상 8 이하"); //여름
            }else if(month >= 9 && month <= 11) {
            System.out.println("변수" + month + "는 9 이상 11 이하"); //가을
            }else if(month ==12 || month > 2 && month >= 2) {
            System.out.println("변수" + month + "는 12와 같거나 0보다 크고  2이하"); //겨울
        }
//9
        int i = 1, a = 2 , x = 1, b = 3, y = 4, c = 1, z = 1;
        int w = 2;
        int num2 = 3;


        if((i != w) && (num1 == num2)){
            System.out.println("변수" + i + "와" + w + "가 같지 않고 변수" + num1 + "과" + num2 + "가 동일하다");}

//10

        if(a == x || b == y || c == z);{
            System.out.println("변수" + a + "와" + x + "가 같거나 변수" + b + "와" + y + "가 같거나 변수" + c + "와" + z + "가 같음");
        }













        }





    }


