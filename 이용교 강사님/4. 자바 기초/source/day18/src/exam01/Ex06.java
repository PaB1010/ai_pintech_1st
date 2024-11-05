// IntStream rangeClosed 연산

package exam01;

import java.util.stream.IntStream;

public class Ex06 {
    public static void main(String[] args) {

        // sum() 최종 연산
        // rangeClose(), filter() 중간 연산
        int sum = IntStream.rangeClosed(1, 100) // 1~100 모두 더함
                .filter(i -> i % 2 == 1) // 홀수만 거름
                .map(i -> i * i) // 제곱으로 변환
                .sum(); // 합계
        
        // 작업 과정이 잘 보이고 유지 보수가 좋다

        System.out.println(sum);
        // 166650
    }
}