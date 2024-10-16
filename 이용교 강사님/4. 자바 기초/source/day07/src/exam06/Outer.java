// 정적(static) 내부 클래스

package exam06;

public class Outer {

    // 인스턴스 변수
    int num1 = 10;
    // 인스턴스 메서드
    void method(){}

    // static 변수
    static int num2 = 20;
    // static 메서드
    static void staticMethod(){}


    // 정적(static) 내부 클래스
    static class Inner {

        void InnerMethod(){
            /*
            외부 클래스의 객체 자원 (인스턴스 변수 & 메서드) 접근 불가
            num1 = 20;
            method();
             */

            // 외부 클래스의 정적(static) 변수 & 메서드 접근 가능
            // 정적 자원은 객체와 상관이 없기 때문
            num2 = 30;
            staticMethod();
        }
    }
}