// this 예약어 & 주소 비교

package exam02.exam02_new;

public class Ex03 {
    public static void main(String[] args) {

        Schedule2 s2 = new Schedule2();

        // this값 = 클래스 내의 메서드 변수
        s2.printThis();
        // 3b07d329
        // = 동일한 값
        // s2값 = 내부에 정의된 지역 변수
        System.out.println(s2);
        // 3b07d329

        // 동일한 주소값을 가지고 있음
        System.out.println(s2 == s2.getThis());
        // true


        // 주소 확인 명령어

        System.out.println("s2 : " + System.identityHashCode(s2));
        // s2 : 990368553
        // = 동일한 값
        Schedule2 _this = s2.getThis();
        System.out.println("this : " + System.identityHashCode(_this));
        // this : 990368553
    }
}