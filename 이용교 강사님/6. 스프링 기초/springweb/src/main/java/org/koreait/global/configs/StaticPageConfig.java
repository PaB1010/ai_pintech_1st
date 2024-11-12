package org.koreait.global.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
    Controller Bean이 없는 정적 페이지 연결 설정
    정적인 페이지를 Controller 없이 경로 매핑
 */
@Configuration
public class StaticPageConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/mypage")
                .setViewName("member/mypage");

        /* 여러 경로를 연달아도 가능
        registry.addViewController()
         */
    }
}