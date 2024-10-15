// 다형성

package exam01;

public class Ex03 {
    public static void main(String[] args) {

        C c = new C();

        // C -> B, A (다형성)
        // A 타입이지만 C 클래스의 객체로 출처가 명확하기 때문에
        // 자연스럽게 자료형 변환
        A a = c;

        // a로 접근하면 A 클래스 객체인 numA만 접근 가능 범위
        // a.numA

        // C -> B, A (다형성)
        // B 타입이지만 C 클래스의 객체로 출처가 명확하기 때문에
        // 자연스럽게 자료형 변환
        B b = c;

        // b로 접근하면 B 클래스 객체인 numA, numB 접근 가능 범위
        // b.numA, b.numB

        System.out.println(a == c);
        // true
        // 같은 주소의 자원이나 범위만 제한

        System.out.println(b == c);
        // true
        // 같은 주소의 자원이나 범위만 제한

        System.out.printf("a는 C에서 유래되었는가?%s%n", a instanceof C);

        System.out.printf("b는 C에서 유래되었는가?%s%n", b instanceof C);

        System.out.printf("a와 b는 모두 C에서 유래되었는가?%s%n", a instanceof C && b instanceof C);
        
        System.out.printf("a는 B에서 유래되었는가?%s%n", a instanceof B);

        System.out.printf("a는 A에서 유래되었는가?%s%n", a instanceof A);
        // 모두 true인 이유
        // -> a, b, c 객체는 모두 동일한 객체로 따라서 유래도 동일
    }
}