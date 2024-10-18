// integer클래스 다형성 & 언박싱

package exam03;

public class Ex01 {
    public static void main(String[] args) {

        // Integer (객체)
        Integer num1 = new Integer(10);
        Integer num2 = new Integer(20);

        // Number 타입 다형성
        Number num10 = new Integer(100);
        System.out.println(num10);

        // 연산은 기본 자료형만 가능!
        // 같은 자료형의 기본 자료형만 가능!

        // JDK 5버전 이전에는 .Value로 객체를 기본형으로 변경해야만 연산 가능했음
        // int num3 = num1.intValue() + num2.intValue();

        // 객체끼리 연산이 된 이유?
        // 자동으로 컴파일러가 .Value 해줌
        // 언박싱 : 기본 자료형 값을 객체에서 꺼내기
        int num3 = num1 + num2;

        System.out.println(num3);
        // 30
    }
}