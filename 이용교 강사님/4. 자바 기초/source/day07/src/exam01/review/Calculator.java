// 리뷰 - 추상 메서드

package exam01.review;

public abstract class Calculator {

    public Calculator () {
        System.out.println("Calculator 생성자");
    }

    // 추상 메서드이나 인스턴스 메서드
    public abstract int add(int num1, int num2);

    public void method() {
        System.out.println("Calculator");
    }

}