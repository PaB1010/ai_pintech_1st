package org.koreait.exam02;

import org.junit.jupiter.api.Test;

public class Ex01 {

    @Test
    void test1() {

        long stime = System.nanoTime(); // 공통 기능

        // 같은 연산이지만 성능이 좋음
        ImplCalculator cal1 = new ImplCalculator();
        long result1 = cal1.factorial(10L); // 핵심 기능
        System.out.printf("cal1 : %d%n", result1);
        // cal1 : 3628800

        long etiem = System.nanoTime(); // 공통 기능
        System.out.printf("cal1 걸린 시간 : %d%n", etiem - stime);


        stime = System.nanoTime(); // 공통 기능

        // 같은 연산이지만 재귀 방식이기때문에 성능이 좋지 않음
        RecCalculator cal2 = new RecCalculator();
        long result2 = cal2.factorial(10L); // 핵심 기능
        System.out.printf("cal2 : %d%n", result2);

        etiem = System.nanoTime(); // 공통 기능
        System.out.printf("cal2 걸린 시간 : %d%n", etiem - stime);
        // cal2 : 3628800
    }

    @Test
    void test2() {

        // ProxyCalculator가 외부에서 ImplCalculator 받아와 대신 수행
        // ProxyCalculator cal1 = new ProxyCalculator(new ImplCalculator());
        // 다형성 이용해 변경
        Calculator cal1 = new ProxyCalculator(new ImplCalculator());
        long result1 = cal1.factorial(10L);
        System.out.printf("cal1 = %d%n", result1);
        // cal1 = 3628800


        // ProxyCalculator가 외부에서 RecCalculator 받아와 대신 수행
        // ProxyCalculator cal2 = new ProxyCalculator(new RecCalculator());
        // 다형성 이용해 변경
        Calculator cal2 = new ProxyCalculator(new RecCalculator());
        long result2 = cal2.factorial(10L);
        System.out.printf("cal2 = %d%n", result2);
        // cal2 = 3628800
    }

    @Test
    void test3() {

        // CachedCalculator cal = new CachedCalculator(new ProxyCalculator(new ImplCalculator()));
        // 다형성 이용해 변경
        Calculator cal = new CachedCalculator(new ProxyCalculator(new ImplCalculator()));

        long r1 = cal.factorial(10L);
        System.out.printf("r1 = %d%n", r1);

        long r2 = cal.factorial(10L);
        System.out.printf("r2 = %d%n", r2);

        long r3 = cal.factorial(10L);
        System.out.printf("r3 = %d%n", r3);

    }
}