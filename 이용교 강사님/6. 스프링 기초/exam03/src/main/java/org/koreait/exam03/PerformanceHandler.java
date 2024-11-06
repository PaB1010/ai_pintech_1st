// Proxy

package org.koreait.exam03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PerformanceHandler implements InvocationHandler {

    // 바뀔 일이 없으니까 상수(final)
    private final Class<?> clz;

    // 생성자
    public PerformanceHandler(Class<?> clz) {
        this.clz=clz;
    }


    // invoke = 메서드 동적 호출
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 공통 기능
        long stime = System.nanoTime();

        try {

            // 기본 생성자 가져옴
            Object obj = clz.getDeclaredConstructor().newInstance();

            // 핵심 기능 대신 수행
            Object result = method.invoke(obj, args);

            return result;
        } finally { //추가 기능 쓸 곳(return 해도 무조건 수행하도록 finally)

            long etime = System.nanoTime();
            System.out.printf("걸린 시간 : %d%n", etime = stime);
        }
    }
}