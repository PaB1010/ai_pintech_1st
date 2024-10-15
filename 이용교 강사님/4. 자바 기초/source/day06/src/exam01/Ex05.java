// 상위 클래스 자료형 -> 하위 클래스 자료형

package exam01;

public class Ex05 {
    public static void main(String[] args) {

        // 출처가 C 클래스 객체인 A 객체
        A ac = new C();
        // "A 생성자 B 생성자 C 생성자"

        // 출처가 D 클래스 객체인 A 객체
        A ad = new D();
        // "A 생성자"

        // ac와 ad의 주소 연산
        System.out.println(ac == ad);
        // false
        
        // C c1 = ad; //오류

        // 상위 클래스 자료형 -> 하위 클래스 자료형 (명시적 형변환)

        // C c1 = (C)ad; // 예외 오류 : ClassCastException
        // Exception in thread "main" java.lang.ClassCastException: class exam01.D cannot be cast to class exam01.C (exam01.D and exam01.C are in unnamed module of loader 'app')
        //	at exam01.Ex05.main(Ex05.java:21)

        // if문 & istnaceof문 활용으로 출처 확인하고 형변환
        if (ad instanceof C) {
            C c1 = (C)ad;
            // if문 조건 false -> 형변환 X
            System.out.println("유입1");
        }

        if (ac instanceof C) {
            C c2 = (C)ac;
            // if문 조건 true -> 형변환 O
            System.out.println("유입2");
        }

        // = 위와 아래는 동일한 코드

        // JAVA ver.17 최근 문법
        // 출처 체크 후 이상 없으면 C로 형변환
        if (ac instanceof C c) {
            System.out.println(c.numC);
            // 30
        }
    }
}