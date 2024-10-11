// 반환값이 없는 함수

package exam01;

public class Ex02 {
    public static void main(String[] args) {
        // Void m = method1(); -> 오류
    }

    //자바는 함수내 함수 정의 불가능 (JS & Python은 함수 객체라 가능)
    static void method1() {
        System.out.println("반환값이 없는 함수!");
    }
}