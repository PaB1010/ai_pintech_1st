// 연습

package org.koriait.exam01.main;

import org.junit.jupiter.api.Test;
import org.koriait.exam01.Greeter;
import org.koriait.exam01.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {

    // main 메서드 없이 test Annotation 사용
    @Test
    void test(){

        // ctx = 컨테이너 객체(객체를 담고 있음)
        // 매개변수 Class에 @Configuration가 있나 체크하기 위해 Class 클래스 객체(AppCtx.class) 사용
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        /*
        AnnotationConfig = 객체 관리 설정 방식
        ApplicationContext = Spring 컨테이너
         */

        // 찾기 위해 Class name 알려주고 getBean(객체를 컨테이너로 꺼내옴)
        // 식별 위해 Class 클래스 객체 매개 변수로 사용
        Greeter g1 = ctx.getBean("greeter", Greeter.class);

        g1.hello("시원");
        // 시원님 안녕하세요

        Greeter g2 = ctx.getBean("greeter", Greeter.class);

        System.out.println(g1 == g2);
        // true
        // 기본적으로 싱글톤으로 객체를 관리
        // 기능은 한개만 있어도 되니까

        // 작업 완료 후 컨테이너 닫기
        ctx.close();
    }
}