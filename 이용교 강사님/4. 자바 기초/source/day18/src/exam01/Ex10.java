// 두 Stream의 연결 Concat()

package exam01;

import java.util.stream.IntStream;

public class Ex10 {
    public static void main(String[] args) {

        IntStream stm1 = IntStream.rangeClosed(1, 50);

        IntStream stm2 = IntStream.rangeClosed(51, 100);

        IntStream stm3 = IntStream.concat(stm1, stm2);

        int sum = stm3.sum();

        System.out.println(sum);
        // 5050

    }
}