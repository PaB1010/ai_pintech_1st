package org.koreait.exam02;

public class ImplCalculator implements Calculator{

    @Override
    public long factorial(long num) {

        long result = 1L;

        // 팩토리얼 연산(!) 구현 for문
        for(long i = 1L; i <= num; i++) {
            result *= i;
        }

        return result;
    }
}