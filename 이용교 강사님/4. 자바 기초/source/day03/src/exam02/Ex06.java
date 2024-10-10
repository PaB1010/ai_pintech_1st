// 배열이라는 변수의 기본값

package exam02;

import java.util.Arrays;

public class Ex06 {
    public static void main(String[] args) {

        double[] nums = new double[4];

        // 배열의 값을 편히 출력하기 위한 함수
        System.out.println(Arrays.toString(nums));
        // [0.0, 0.0, 0.0, 0.0]
        // 실수라 기본값이 0.0

        // 참조형 자료형
        String[] words = new String[4];
        System.out.println(Arrays.toString(words));
        // [null, null, null, null]
        // 참조형 자료형이라 기본값이 null
    }
}
