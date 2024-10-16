// implements 예약어로 추상 메서드 구현

package exam02;

// implements 예약어 -> extends와 다르게 구현에만 초점, 공통자원에는 관심 X
public class SimpleCalculator implements Calculator{

    // 인스턴스 메서드
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

}