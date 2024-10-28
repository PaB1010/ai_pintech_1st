// 메서드 참조 문법 (Function)

package exam01;

import java.util.function.ToIntFunction;

public class Ex04 {
    public static void main(String[] args) {

        // 문자열<String>이 들어오면 문자열 길이(Int)로 반환
        ToIntFunction<String> func1 = s -> s.length();

        // 더 짧게(충분히 유추가능하므로)
        ToIntFunction<String> func2 = String::length;
    }
}