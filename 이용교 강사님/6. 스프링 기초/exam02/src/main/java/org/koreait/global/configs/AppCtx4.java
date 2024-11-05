// Component Scan

package org.koreait.global.configs;

import org.koreait.member.repositories.MemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "org.koreait.member"
        //, excludeFilters = @ComponentScan.Filter(type= FilterType.ANNOTATION, classes = ManualBean.class)
        // @ManualBean는 배제한다는 뜻
        // , excludeFilters = @ComponentScan.Filter(type= FilterType.ASSIGNABLE_TYPE, classes = {MemberRepository.class})
        // , excludeFilters = @ComponentScan.Filter(type=FilterType.ASPECTJ, pattern = "org.koreait..*Repository")
        // 모든 koreait 패키지 내에서 ~Repository로 끝나는 클래스
        )

public class AppCtx4 {

    /*
    @Bean
    public MemberRepository memberRepository() {

        // 수동 등록 @Bean 우선 적용 확인용 출력 메시지
        System.out.println("호출!");
        return new MemberRepository();
    }
     */
}