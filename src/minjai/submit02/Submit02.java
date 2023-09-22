package minjai.submit02;

import java.util.Calendar;
import java.util.Scanner;

public class Submit02 {
    public static void main(String[] args) {




        Scanner san = new Scanner(System.in);





//doubel avg = (double)(intkor + intEng + intMate) /3;
        //System.out.println("평균: %.2f"\n", avg);



//자동 형변환을 이용한 int -> String 변환


        Scanner scan = new Scanner(System.in);



        System.out.println(scan);
        System.out.println("이름을 입력해주세요");
        System.out.print(">>> ");
        String name = scan.nextLine();


        System.out.println("영어 점수를 입력해주세요");
        System.out.print(">>> ");
        String English = scan.nextLine();

        System.out.println("국어 점수를 입력해주세요");
        System.out.print(">>> ");
        String Literary = scan.nextLine();


        System.out.println("수학 점수를 입력해주세요");
        System.out.print(">>> ");
        String Math = scan.nextLine();

        String na = "손민재";
        String en = "67";
        String Li = "74";
        String Ma = "70";
        String av = "70.3333333";

        System.out.println("이름: " + na);
        System.out.println("영어: " + en);
        System.out.println("국어: " + Li);
        System.out.println("수학: " + Ma);
        System.out.println("평균: " + av);











        System.out.println("\n================\n");








       int example = 278;

        String s = Integer.toString(example);
        int son =0;
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            int num = Character.getNumericValue(a);
            son += num;




        }
        System.out.println("결과 : " + son);















































    }
}
