// Spring 설정

package org.koreait.global.configs;

import org.koreait.member.repositories.MemberRepository;
import org.koreait.member.services.JoinService;
import org.koreait.member.services.MemberInfoService;
import org.koreait.member.validators.JoinValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// Spring 설정 클래스로 인식하게 해주는 Annotation
@Configuration

// 다른 설정 클래스를 통합해 사용 @Import
@Import(AppCtx2.class)
public class AppCtx {

    /*

    // Spring이 관리할 객체로 인식하게 해주는 Annotation (수동)
    @Bean
    // 메서드 명이 기본 Bean의 이름
    public JoinValidator joinValidator() {

        return new JoinValidator();
    }

    @Bean
    public MemberRepository memberRepository() {

        return new MemberRepository();
    }

    @Bean
    public JoinService joinService() {

        // 위의 객체 두개를 메서드로 조립
        return new JoinService(joinValidator(), memberRepository());
    }

    @Bean
    public MemberInfoService memberInfoService() {

        // setter라서 완전한 객체로 주입해야함
        // 이게 없을때 대체 로직 주입 가능
        MemberInfoService service = new MemberInfoService();

        service.setRepository(memberRepository());

        return service;
    }

     */
}