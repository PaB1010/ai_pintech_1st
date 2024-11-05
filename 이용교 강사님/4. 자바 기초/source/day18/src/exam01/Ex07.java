// Stream 변환 boxed()

package exam01;

import java.util.Arrays;
import java.util.Comparator;

public class Ex07 {
    public static void main(String[] args) {

        int[] nums = {22, 11, 5, 3, 66, 33, 24, 98};

        // toArray() 최종 연산
        int[] sortedNums = Arrays.stream(nums).sorted().toArray();

        System.out.println(Arrays.toString(sortedNums));
        // [3, 5, 11, 22, 24, 33, 66, 98]

        /*
        int[] sortedNums2 = Arrays.stream(nums)
                .mapToObj(Integer::valueOf)
                .sorted(Comparator.reverseOrder())
                .mapToInt(i -> i)
                .toArray();
                // 역정렬을 쓰기 위해 boxed() -> Stream<Integer>
         */

        int[] sortedNums2 = Arrays.stream(nums)
                .boxed() // mapToObj(Integer::valueOf)와 같음
                .sorted(Comparator.reverseOrder())
                .mapToInt(i -> i)
                .toArray();
        // 역정렬을 쓰기 위해 boxed() -> Stream<Integer>

        System.out.println(Arrays.toString(sortedNums2));
        // [98, 66, 33, 24, 22, 11, 5, 3]
    }
}