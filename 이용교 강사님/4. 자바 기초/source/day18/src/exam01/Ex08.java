// Stream 활용 Random

package exam01;

import java.util.Arrays;
import java.util.Random;

public class Ex08 {
    public static void main(String[] args) {

        Random random = new Random();

        long[] nums = random.longs().limit(10).toArray();
        // 10개의 난수 생성

        System.out.println(Arrays.toString(nums));
    }
}