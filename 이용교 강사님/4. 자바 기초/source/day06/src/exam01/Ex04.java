// 상위 클래스로 자료형 한정 문법

package exam01;

public class Ex04 {
    public static void main(String[] args) {

        // 비선호 문법
        C c = new C(); // C -> B -> A
        A ac = c;

        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(ac));
        // 동일 주소 값

        // 위와 아래는 동일한 코드

        // 선호 문법
        A a = new C();

        B b = new C();

        System.out.println(a == b);
        // false (주소는 같은 C 객체 주소지만 접근 범위가 달라서)
    }
}