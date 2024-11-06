// Spring Cache

package org.koreait.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

import java.util.HashMap;
import java.util.Map;

// @Aspect = Proxy Class
@Order(1)
@Aspect
public class SpringCachedCalculator {

    private Map<Long, Object> cache = new HashMap<>();

    /*
    @Pointcut("execution(* org.koreait.exam04..*(..))")
    public void publicTarget() {

    }
     */

    // @Around("publicTarget()")
    // 범위 경로 하나로 간단할 경우 바로 @Around에 써도 무방
    // @Around("execution(* org.koreait.exam04..*(..))")
    @Around("CommonPointcut.publicTarget()")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {
        // 매개변수 값 순서대로 배열의 형태로 가져오는 메서드
        Object[] args = joinPoint.getArgs();

        long num = (long)args[0];

        // cache에 num이 이미 있다면 cache의 num을 가져옴
        if(cache.containsKey(num)) {

            System.out.println("Cache에서 가져옴...");
            return cache.get(num);
        }

        // 핵심기능 대신 호출해 실행
        Object result = joinPoint.proceed();

        // cache에 없을경우 cache에 저장
        cache.put(num, result);
        System.out.println("Cache에 값 저장...");

        return result;
    }
}