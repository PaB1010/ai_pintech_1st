// 함수형 인터페이스 유형

package exam02;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class Ex01 {
    public static void main(String[] args) {

        /*
        // 지네릭 클래스는 타입 명시시 무조건 참조형
        // 즉 기본형 사용 불가
        // int는 불가 integer는 가능
        BiFunction<Integer, Integer, Integer> cal = (a, b) -> a + b;

        System.out.println(cal.apply(10,20));
         */

        /*
        // Integer에서 연산하기위해 int로 언박싱하면서 낭비
        BinaryOperator<Integer> cal = (a, b) -> a + b;
        int result = cal.apply(10, 20);
         */

        IntBinaryOperator cal = (a, b) -> a + b;

        int result = cal.applyAsInt(10, 20);
        System.out.println(result);
    }
}