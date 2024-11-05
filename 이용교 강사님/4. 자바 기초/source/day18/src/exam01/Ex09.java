// Stream 람다식 iterate() generate()

package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex09 {
    public static void main(String[] args) {

        List<String> hearts = Stream.generate(() -> "💗").limit(10).toList();
        // 투입 값 없이 limit 만큼 💗를 반환

        System.out.println(hearts);
        // [💗, 💗, 💗, 💗, 💗, 💗, 💗, 💗, 💗, 💗]

        int[] nums = IntStream.iterate(1, i -> i + i).limit(10).toArray();
        // 첫 반환 값이 다음 투입 값이 되는

        System.out.println(Arrays.toString(nums));
        // [1, 2, 4, 8, 16, 32, 64, 128, 256, 512]
    }
}