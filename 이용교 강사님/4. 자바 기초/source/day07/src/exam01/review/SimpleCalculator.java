// 다중상속 불가

package exam01.review;

// 오류
// public class SimpleCalculator extends Calculator, Calculator2{

public class SimpleCalculator extends Calculator{

    public SimpleCalculator() {

        super();

    }

    @Override
    // 인스턴스 메서드
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}