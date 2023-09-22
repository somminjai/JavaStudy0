package ch03_system;

public class Comments {

    /**
     *  좋아하는 과일
     */
    static String apple = "사과";

    public static void main(String[] args) {


        // 자바 문서 (javadoc) 주석
        // 메소드 사용법에 대해 설명하는 용도로 사용


        // 주석(Comment)
        // 단일 주석 (코드 앞에 //)
        // 프로그래밍 언어마다 주석이 다른 경우가 많다
        // 단축키 [Ctrl + /]

        System.out.println("주석");
        System.out.println("주석");
        System.out.println("주석");
        System.out.println("주석");

        /* 다중 주석 */
        /*
         *  작성자:
         *  작성일:
         *
         * */

        System.out.println(apple);

        // TODO 주석
        // 개발 중에 구현해야할 부분에 대해서
        //미리 코맨트를 남겨놓는 경우 이용

    }
}
