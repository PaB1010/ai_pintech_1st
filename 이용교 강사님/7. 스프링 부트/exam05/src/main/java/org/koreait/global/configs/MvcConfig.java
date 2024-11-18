package org.koreait.global.configs;

import lombok.RequiredArgsConstructor;
import org.koreait.member.validators.JoinValidator;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// @EnableWebMvc = 불필요
@Configuration
// @RequiredArgsConstructor
public class MvcConfig implements WebMvcConfigurer {

    // 전역 검증용 의존 주입
    // private final JoinValidator joinValidator;

    /**
     * 모든 @Valid가 적용된 커맨드 객체 검증에 사용
     * 이런 방식은 적합X 단순 교육용
     * @return
     */

    /*
    @Override
    public Validator getValidator() {
        return joinValidator;
    }
     */
}