package exam01;

public class Ex04 {
    public static void main(String[] args) {
        int num1 = 100; //변수
        num1 = 200;

        // 초기화 값인 100이 아닌 200 출력
        System.out.println(num1);


        // 상수명이 소문자 -> 관례 부적합
        final int num2 = 200; //상수


        // num2 = 300; 상수에 값을 할당하지 못해 오류


        // 상수명이 대문자 -> 관례 적합
        // 멤버 변수로 정의한 경우는 초기화 진행 필수
        final int NUM = 100;

        // 함수 밖에서는 오류
        final int MAX_NUMBER;


    }
    // 함수 밖에서 초기화 없이 상수 선언만 할시 오류
    // final int MAX_NUMBER;
}
