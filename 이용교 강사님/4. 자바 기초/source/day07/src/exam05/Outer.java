// 인스턴스 내부 클래스

package exam05;

// Outer = 외부 클래스
public class Outer {

    int num1 = 10;

    // Inner = 인스턴스 내부 클래스
    class Inner {

        static int num = 20;

        // (동일한 이름의 메서드가 내부 클래스에 없을 경우)
        // 내부클래스에서도 외부클래스의 인스턴스 변수는 바로 접근 가능
        void method() {
            // 지금은 내부 클래스(Inner)의 num1
            System.out.println(num1);

            // 외부클래스(Outer)의 num1
            System.out.println(Outer.this.num1);
        }

        // 이러면 외부 클래스의 num1 = 10이 아니라
        // 내부 클래스의 num1 = 30이 우선적으로
        int num1 = 30;
    }
}