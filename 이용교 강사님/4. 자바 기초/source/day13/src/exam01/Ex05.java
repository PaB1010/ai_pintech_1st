// 문자열 동등성 비교(equals)
// 매개변수 2개 판별식 = BiPredicate

package exam01;

import java.util.function.BiPredicate;

public class Ex05 {
    public static void main(String[] args) {

        // 문자열 둘이 동등한지 비교
        BiPredicate<String, String> cond1 = (s1, s2) -> s1.equals(s2);
        // 노란색 바탕 -> IntelliJ가 더 좋은 문법을 추천

        // 더욱 간략하게
        // s1 s2의 순서 동일해 판단하기 쉬울경우만 메서드 참조 가능
        BiPredicate<String, String> cond2 = String::equals;

        // equals 연산시 s1 s2 순서가 반대이므로 메서드 참조 불가
        BiPredicate<String, String> cond3 = (s1, s2) -> s2.equals(s1);

        // 이러면 s2.equals(s1)이 아니라 s1.equals(s2)가 되어버림
        BiPredicate<String, String> cond4 = String::equals;
    }
}