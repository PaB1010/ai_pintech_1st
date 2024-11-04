// Test 클래스

package org.koreait.exam01;

import org.junit.jupiter.api.Test;
import org.koreait.global.configs.AppCtx;
import org.koreait.global.configs.AppCtx2;
import org.koreait.global.configs.AppCtx3;
import org.koreait.member.controllers.RequestJoin;
import org.koreait.member.services.JoinService;
import org.koreait.member.services.MemberInfoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex01 {

    @Test
    void test1() {

        /*
        설정(AnnotationConfig) + Container 생성(ApplicationContext)
        설정 클래스를 보고 내부에서 객체 생성해 Container에 담음
        = Spring(IOC) Container
        항상 매개로 @Configuration 설정한 Spring 설정 Class 클래스 객체 정보를 줘야함
         */
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx3.class);
        // 1) 객체 생성 2) 의존성 주입 3) 초기화 -> 모든 완성된 객체가 컨테이너 안에 있음

        // JoinService service = ctx.getBean("joinService", JoinService.class);
        // 중복되는 BeanName 메서드가 없어서 "BeanName" 생략 가능!
        JoinService service = ctx.getBean(JoinService.class);

        // MemberInfoService memberInfoService = ctx.getBean("memberInfoService", MemberInfoService.class);
        // 마찬가지로 생략 가능
        MemberInfoService memberInfoService = ctx.getBean(MemberInfoService.class);

        RequestJoin form = new RequestJoin();
        form.setEmail("user01@test.org");
        form.setPassword("12345678");
        form.setConfirmPassword("12356789");
        form.setUserName("사용자01");
        form.setAgree(true);

        // 회원 가입 처리 (JoinService)
        service.process(form);

        // 가입한 회원 목록 출력 (MemberInfoService)
        memberInfoService.print();
        // Member(seq=1730693273299, email=user01@test.org, password=12345678, userName=사용자01, regDt=2024-11-04T13:07:53.304529400, modDt=null)

        ctx.close();
    }

    @Test
    void test2() {

        // AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class, AppCtx2.class);
        
        // AppCtx에 AppCtx2를 통합했으니 위와 다르게 생성자 매개 변수를 하나만 써도 됨
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        DateTimeFormatter formatter = ctx.getBean(DateTimeFormatter.class);

        String str = formatter.format(LocalDateTime.now());

        System.out.println(str);
        // 2024.11.04 13:07:53:753

        ctx.close();
    }
}