// 함수의 합성(Predicate)

package exam01;

import java.util.function.IntPredicate;

public class Ex02 {
    public static void main(String[] args) {

        // Int형 매개변수가 10보다 크나 판별
        // x >= 10
        IntPredicate cond1 = x -> x >= 10;

        // Int형 매개변수가 100보다 작나 판별
        // x <= 100
        IntPredicate cond2 = x -> x <= 100;

        // cond1 & cond2 함수의 결합
        // x >= 10 && x <= 100
        IntPredicate cond3 = cond1.and(cond2);

        System.out.println(cond3.test(150));
        // false
        System.out.println(cond3.test(50));
        // true
        System.out.println(cond3.test(5));
        // false

        // x <= 100인 cond2을 부정(negate)해 정의
        // x > 100
        IntPredicate cond4 = cond2.negate();

        System.out.println(cond4.test(150));
        // true


        // x >= 10 && x <= 100을
        // x < 10 || x > 100으로 변환
        IntPredicate cond5 = cond3.negate();
        System.out.println(cond5.test(10));
        // false
        System.out.println(cond5.test(150));
        // true
    }
}