// 항등 함수 (identity)

package exam01;

import java.util.function.Function;

public class Ex03 {
    public static void main(String[] args) {

        // 항등 함수
        // 매개 변수로 투입된 값을 반환 값으로 그대로 반환하는 형태
        Function<String, String> func1 = s -> s;

        // 위 아래 동일
        // 위가 더 편하지만 아래가 좀 더 의미적으로 명확히 표기된 방법

        // s -> s
        Function<String, String> func2 = Function.identity();
    }
}