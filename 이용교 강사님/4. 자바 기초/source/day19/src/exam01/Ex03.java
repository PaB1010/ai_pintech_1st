// Stream의 최종 연산 실습

package exam01;

import java.util.List;

public class Ex03 {
    public static void main(String[] args) {

        List<String> words = List.of("AA", "BBB", "CCC", "DDD", "EEEE");

        boolean result1 = words.stream().allMatch(s -> s.length() >= 3);

        System.out.println(result1);
        // false (모두 true여야 true인데 "AA"가 false라서)

        boolean result2 = words.stream().anyMatch(s -> s.length() >= 3);

        System.out.println(result2);
        // true (하나라도 true면 true)
    }
}