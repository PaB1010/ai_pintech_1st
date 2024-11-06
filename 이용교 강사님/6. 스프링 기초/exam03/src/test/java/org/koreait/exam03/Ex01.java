package org.koreait.exam03;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

public class Ex01 {

    @Test
    void test1() {

        Class<RecCalculator> clazz = RecCalculator.class;

        // 매개변수 = Class 노드,
        Calculator cal = (Calculator) Proxy.newProxyInstance(
                clazz.getClassLoader(),
                new Class[]{Calculator.class},
                new PerformanceHandler(clazz)
        );

        long result = cal.factorial(10L);
        System.out.println(result);
    }
}