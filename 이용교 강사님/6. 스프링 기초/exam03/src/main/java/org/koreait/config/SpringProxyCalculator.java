// Spring Proxy

package org.koreait.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

// @Aspect = Proxy Class 임을 명시하는 Annotation
@Order(2)
@Aspect
public class SpringProxyCalculator {

    // 반환값 *(전체)
    // 적용대상 ..*(해당 패키지 포함한 하위 패키지의 모든 클래스)
    // 메서드 (..) 모든 메서드..?
//    @Pointcut("execution(* org.koreait.exam04..*(..))")
//    public void publicTarget() {
//
//    }

    /*
    // @Before = 조인 포인트 실행 이전에 실행
    @Before("publicTarget()")
    public void beforeProcess(JoinPoint joinPoint) throws Throwable{
        System.out.println("@Before!");
    }

    // @After = 조인 포인트가 정상 또는 예외에 관계없이 실행(finally)
    @After("publicTarget()")
    public void afterProcess(JoinPoint joinPoint) throws Throwable {
        System.out.println("@After!");
    }
     */

    // @Around("publicTarget()")
    // @Around("org.koreait.config.CommonPointcut.publicTarget()")
    // 같은 패키지라 org.koreait.config 생략 가능
    @Around("CommonPointcut.publicTarget()")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {
        // ProceedingJoinPoint = 호출된

        long stime = System.nanoTime();

        try {
            // 핵심 기능을 대신 호출해 수행
            Object result = joinPoint.proceed();
            return result;
        } finally {
            long etime = System.nanoTime();
            System.out.printf("걸린 시간 : %d%n", etime - stime);
        }
    }
}