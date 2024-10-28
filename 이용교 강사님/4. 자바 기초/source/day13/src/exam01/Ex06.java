// 매개변수 람다(Function)를 메서드 참조로 (Stream 활용)

package exam01;

import java.util.stream.Stream;

public class Ex06 {
    public static void main(String[] args) {

        // 매개변수 람다(Function)
        String[] strs = Stream.of("Apple", "Orange", "Melon")
                .toArray(x -> new String[x]);

        // 람다를 메서드 참조
        String[] strs2 = Stream.of("Apple", "Orange", "Melon")
                .toArray(String[]::new);


        System.out.println(strs2[0]);
        // Apple
    }
}