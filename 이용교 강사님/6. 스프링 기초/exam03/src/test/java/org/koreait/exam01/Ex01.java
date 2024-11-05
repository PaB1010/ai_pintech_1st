package org.koreait.exam01;

import org.junit.jupiter.api.Test;
import org.koreait.exam01.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {

    @Test
    void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
        // 객체 생성 -> 의존 설정 -> 초기화(InitializingBean)

        Message m1 = ctx.getBean(Message.class);

        m1.send("안녕하세요");

        Message m2 = ctx.getBean(Message.class);

        System.out.println(m1==m2);
        // true -> Singleton 형태로 객체 관리
        
        ctx.close();
        // 소멸 전 destroy() 호출
        // close하지 않을 경우 destroy 메서드는 아예 호출되지 않음
    }

    @Test
    void test2() {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Message2 m1 = ctx.getBean(Message2.class);
        Message2 m2 = ctx.getBean(Message2.class);

        System.out.println(m1 == m2);
        // false -> prototype 이라서 다른 객체로 생성됨

        // prototype이라서 동작 안할수도
        ctx.close();
    }
}