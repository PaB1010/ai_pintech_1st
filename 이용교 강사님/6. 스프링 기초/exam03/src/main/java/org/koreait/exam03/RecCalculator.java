// 재귀 방식 (같은 메서드를 다시 호출해 사용)

package org.koreait.exam03;

public class RecCalculator implements Calculator {

    @Override
    public long factorial(long num) {

        if (num < 1L) {
            return 1L;
        }

        return num * factorial(num - 1);
    }
}