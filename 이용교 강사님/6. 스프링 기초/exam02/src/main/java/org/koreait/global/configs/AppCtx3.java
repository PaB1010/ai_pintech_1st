// Spring Container 내부에서 reflection API(동적 호출, 주입 등) 활용

package org.koreait.global.configs;

import org.koreait.member.repositories.MemberRepository;
import org.koreait.member.services.JoinService;
import org.koreait.member.services.MemberInfoService;
import org.koreait.member.validators.JoinValidator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.format.DateTimeFormatter;

@Configuration
public class AppCtx3 {

    @Bean
    public JoinValidator joinValidator() {
        return new JoinValidator();
    }

    @Bean
    @Qualifier("mRepo")
    public MemberRepository memberRepository() {
        return new MemberRepository();
    }

    /*
    @Bean
    @Qualifier("mRepo2")
    public MemberRepository memberRepository2() {
        return new MemberRepository();
    }
     */

    // 의존성 해결 안하고 자동으로 주입(Autowired) 해보기
    @Bean
    public JoinService joinService () {
        return new JoinService();
    }

    // 연관 관계이기때문에 외부에서 의존성 주입 없어도 오류 안뜸(대체가 있기 때문)
    @Bean
    public MemberInfoService memberInfoService() {
        return new MemberInfoService();
    }

    // @Bean
    public DateTimeFormatter formatter() {
        return DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss:ms");
    }
}
