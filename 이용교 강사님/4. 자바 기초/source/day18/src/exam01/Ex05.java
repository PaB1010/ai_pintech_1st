// 기본형 Stream이 필요한 이유

package exam01;

import java.util.List;

public class Ex05 {
    public static void main(String[] args) {

        // Wrapper Class
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);

        // 비효율적 연산 -> 기본형인 Int가 아닌 Integer로 연산하기때문에 언박싱과정 반복
        int sum = nums.stream().reduce(0, Integer::sum);

        System.out.println(sum);
        // 55

    }
}